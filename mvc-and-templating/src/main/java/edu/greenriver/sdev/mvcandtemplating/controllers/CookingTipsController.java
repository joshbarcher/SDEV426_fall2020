package edu.greenriver.sdev.mvcandtemplating.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cooking")
public class CookingTipsController
{
    private Map<String, String[]> tipsByType = new HashMap<>();

    public CookingTipsController()
    {
        tipsByType.put("grilling", new String[] {
                "Preheat the Grill.",
                "Keep it Clean.",
                "Oil the Food, ArithmeticOpTable.UnaryOp.Not the Grate.",
                "Keep the Lid Down.",
                "Time and Temperature.",
                "Know When to Be Direct, Know When to be Indirect.",
                "Maintaining Temperatures.",
                "Tame the Flame."
        });
        tipsByType.put("baking", new String[] {
                "Always Have the Correct Butter Consistency.",
                "Room Temperature is KEY.",
                "Read the Recipe Before Beginning.",
                "Always Have Ingredients Prepped.",
                "Learn How to Measure.",
                "Weigh Your Ingredients.",
                "Get an Oven Thermometer.",
                "Keep Your Oven Door Closed."
        });

        tipsByType.put("steaming", new String[] {
                "Don’t Add Too Much Water.",
                "Boil the Water First.",
                "Don’t Steam For Too Long.",
                "Enhance the Steam By Using Stock & Herbs.",
                "Make Sure the Seal is Air-Tight.",
                "Prepare the Food Before Steaming."
        });
    }


}