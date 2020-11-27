package edu.greenriver.sdev.securitydemoapp;

import edu.greenriver.sdev.securitydemoapp.entities.User;
import edu.greenriver.sdev.securitydemoapp.entities.UserRole;
import edu.greenriver.sdev.securitydemoapp.repositories.IUserRepository;
import edu.greenriver.sdev.securitydemoapp.repositories.IUserRoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootApplication
public class SecurityDemoAppApplication
{

    public static void main(String[] args)
    {
        ApplicationContext context = (ApplicationContext)SpringApplication.run(
                SecurityDemoAppApplication.class, args);

        IUserRepository userRepo = context.getBean(IUserRepository.class);
        IUserRoleRepository roleRepo = context.getBean(IUserRoleRepository.class);
        BCryptPasswordEncoder encoder = context.getBean(BCryptPasswordEncoder.class);

        List<UserRole> roles = List.of(
            UserRole.builder().role("ROLE_ADMIN").build(),
            UserRole.builder().role("ROLE_USER").build()
        );
        roleRepo.saveAll(roles);

        //create a few dummy users
        User bobTheAdmin = User.builder()
            .username("bob")
            .password(encoder.encode("pass123"))
            .build();
        userRepo.save(bobTheAdmin);

        //enter them into db
        roles.forEach(role -> role.setUser(bobTheAdmin));
        bobTheAdmin.setRoles(roles);
        userRepo.save(bobTheAdmin);
    }

}
