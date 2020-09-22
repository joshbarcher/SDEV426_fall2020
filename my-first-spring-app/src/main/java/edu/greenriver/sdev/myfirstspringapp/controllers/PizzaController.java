package edu.greenriver.sdev.myfirstspringapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaController
{
    //define a route (http://localhost:8080/index)
    @RequestMapping("index")
    public String index()
    {
        //gather data (validate, prepare, clean, ...)

        //load a view
        return "home";
    }
}
