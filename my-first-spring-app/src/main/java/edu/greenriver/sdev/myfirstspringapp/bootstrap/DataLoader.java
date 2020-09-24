package edu.greenriver.sdev.myfirstspringapp.bootstrap;

import edu.greenriver.sdev.myfirstspringapp.model.Pizza;
import edu.greenriver.sdev.myfirstspringapp.repositories.IPizzaRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>
{
    private IPizzaRepository repo;

    public DataLoader(IPizzaRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        Pizza pizza1 = new Pizza(0, 16, true, "pepperoni");
        Pizza pizza2 = new Pizza(0, 12, false, "margherita");

        repo.save(pizza1);
        repo.save(pizza2);
    }
}
