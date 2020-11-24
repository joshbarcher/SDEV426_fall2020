package edu.greenriver.sdev.securitydemoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    //we need to provide a hashing mechanism for passwords
    @Bean
    public BCryptPasswordEncoder encoder()
    {
        return new BCryptPasswordEncoder();
    }

    //choose how to authenticate
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        BCryptPasswordEncoder encoder = encoder();

        auth.inMemoryAuthentication()
            .withUser("admin_user").password(encoder.encode("pass123")).roles("USER", "ADMIN")
            .and()
            .withUser("regular_user").password(encoder.encode("pass123")).roles("USER");
    }

    //choosing which directories to look down (or not)
    @Override
    public void configure(WebSecurity web) throws Exception
    {
        web
            .ignoring().antMatchers("/resources/**")
            .and()
            .ignoring().antMatchers("/h2-console/**");
    }

    //set up our login/logout pages and permissions
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
            .authorizeRequests()
                .antMatchers("/userpages/**").hasAnyRole("USER")
                .antMatchers("/adminpages/**").hasAnyRole("ADMIN")
                .antMatchers("/**").permitAll()
            .and()
            .formLogin()
                .permitAll()
                .loginProcessingUrl("/login");
    }
}
