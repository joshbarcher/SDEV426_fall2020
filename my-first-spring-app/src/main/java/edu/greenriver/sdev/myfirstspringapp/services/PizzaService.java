package edu.greenriver.sdev.myfirstspringapp.services;

import edu.greenriver.sdev.myfirstspringapp.model.Pizza;
import edu.greenriver.sdev.myfirstspringapp.repositories.IPizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//all the business logic for pizzas goes here...
@Service
public class PizzaService
{
    private IPizzaRepository repo;

    public PizzaService(IPizzaRepository repo)
    {
        this.repo = repo;
    }

    public List<Pizza> getAllPizzas()
    {
        //other business logic here...

        return repo.findAll();
    }
}
