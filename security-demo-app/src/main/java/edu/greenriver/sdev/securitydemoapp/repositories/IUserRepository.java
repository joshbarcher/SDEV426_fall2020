package edu.greenriver.sdev.securitydemoapp.repositories;

import edu.greenriver.sdev.securitydemoapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByUsernameEquals(String username);
}
