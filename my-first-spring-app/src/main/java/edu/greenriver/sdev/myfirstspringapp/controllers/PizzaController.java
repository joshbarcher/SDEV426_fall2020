package edu.greenriver.sdev.myfirstspringapp.controllers;

import edu.greenriver.sdev.myfirstspringapp.model.Pizza;
import edu.greenriver.sdev.myfirstspringapp.services.PizzaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PizzaController
{
    private PizzaService service;

    public PizzaController(PizzaService service)
    {
        this.service = service;
    }

    //define a route (http://localhost:8080/index)
    @RequestMapping("index")
    public String index(Model model)
    {
        //gather data (validate, prepare, clean, ...)
        List<Pizza> pizzas = service.getAllPizzas();
        model.addAttribute("pizzas", pizzas);

        //load a view
        return "home";
    }
}
