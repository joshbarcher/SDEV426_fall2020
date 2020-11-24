package edu.greenriver.sdev.securitydemoapp.repositories;

import edu.greenriver.sdev.securitydemoapp.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, Integer>
{
}
