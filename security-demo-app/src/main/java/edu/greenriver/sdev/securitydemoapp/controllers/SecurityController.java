package edu.greenriver.sdev.securitydemoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController
{
    @GetMapping("/index")
    public String index()
    {
        return "home";
    }

    @GetMapping("/userpages/index")
    public String userPage()
    {
        return "user_page";
    }

    @GetMapping("/adminpages/index")
    public String adminPage()
    {
        return "admin_page";
    }
}
