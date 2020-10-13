package edu.greenriver.sdev.mvcandtemplating.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("baking")
public class BakingTipsController
{
    private Random random = new Random();
    private String[] bakingTips = {
            "Always Have the Correct Butter Consistency.",
            "Room Temperature is KEY.",
            "Read the Recipe Before Beginning.",
            "Always Have Ingredients Prepped.",
            "Learn How to Measure.",
            "Weigh Your Ingredients.",
            "Get an Oven Thermometer.",
            "Keep Your Oven Door Closed."
    };

    //localhost:8080/baking/random
    @RequestMapping("random")
    public String randomTip(Model model)
    {
        //save a random tip to the model (similar to the f3 hive)
        String tip = bakingTips[random.nextInt(bakingTips.length)];
        model.addAttribute("randomTip", tip);

        //load my view
        return "baking/random"; //return the name of a template
    }

    @RequestMapping(path = {"tips", "all", ""})
    public String tips(Model model)
    {
        model.addAttribute("tips", bakingTips);
        return "baking/all";
    }

    @RequestMapping("num_tips")
    public String numTips(Model model)
    {
        return "baking/num_tips";
    }

    @RequestMapping("{tipId}")
    public String tipById(@PathVariable int tipId, Model model)
    {
        return "baking/tip_by_id";
    }
}