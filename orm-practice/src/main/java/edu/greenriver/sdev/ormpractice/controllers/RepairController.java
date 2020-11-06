package edu.greenriver.sdev.ormpractice.controllers;

import edu.greenriver.sdev.ormpractice.entities.Repair;
import edu.greenriver.sdev.ormpractice.services.RepairService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("repair")
public class RepairController
{
    private RepairService service;

    //using dependency injection here!!!
    public RepairController(RepairService service)
    {
        this.service = service;
    }

    @GetMapping("all")
    public String allRepairs(Model model)
    {
        model.addAttribute("repairs", service.getCompleted());
        return "all_repairs";
    }

    @GetMapping("add")
    public String showAddForm(Model model)
    {
        model.addAttribute("repair", new Repair());
        return "add_repair";
    }

    @PostMapping("add")
    public String handleAddForm(@ModelAttribute Repair repair)
    {
        service.addNewRepair(repair);
        return "redirect:/repair/all";
    }
}
