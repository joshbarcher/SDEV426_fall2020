package edu.greenriver.sdev.securitydemoapp.services;

import edu.greenriver.sdev.securitydemoapp.entities.User;
import edu.greenriver.sdev.securitydemoapp.repositories.IUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

//this service retrieves user records from the db and provides them to Spring Security
@Service
public class UserAccountService implements UserDetailsService
{
    private IUserRepository repo;

    //inject the repo I need
    public UserAccountService(IUserRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Optional<User> user = repo.findByUsernameEquals(username);
        if (user.isPresent())
        {
            return user.get();
        }

        throw new UsernameNotFoundException("Error finding user with that username");
    }
}
