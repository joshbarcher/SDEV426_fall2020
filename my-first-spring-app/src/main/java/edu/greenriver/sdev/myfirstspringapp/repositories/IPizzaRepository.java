package edu.greenriver.sdev.myfirstspringapp.repositories;

import edu.greenriver.sdev.myfirstspringapp.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Integer>
{
    //I am borrowing CRUD methods from JpaRepository
}
