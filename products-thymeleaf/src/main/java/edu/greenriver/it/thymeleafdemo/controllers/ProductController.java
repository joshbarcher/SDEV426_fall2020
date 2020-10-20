package edu.greenriver.it.thymeleafdemo.controllers;

import edu.greenriver.it.thymeleafdemo.model.Product;
import edu.greenriver.it.thymeleafdemo.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductController
{
    private Product[] fakeProducts = {
        new Product(
            "fishing pole", 79.99,
            "A must have for any angler.",
            Sale.ON_SALE
        ),
        new Product(
            "computer monitor", 199.99,
            "An LCD panel with 60hz.",
            Sale.ONE_TIME_ONLY
        ),
        new Product(
            "refrigerator magnets", 1.99,
            "A 5 pack of magnets for the fridge.",
            Sale.NO_SALE
        )
    };

    @RequestMapping("highlighted")
    public String highlighted(Model model)
    {
        Product product = new Product(
            "fishing pole", 79.99,
            "A must have for any angler.",
            Sale.ON_SALE
        );
        model.addAttribute("product", product);
        model.addAttribute("sale_status", product.getOnSale().toString());
        model.addAttribute("products", fakeProducts);

        return "highlighted";
    }

    @RequestMapping("{name}")
    public String productByName(@PathVariable String name, Model model)
    {
        model.addAttribute("product", getProductByName(name));

        return "product_by_id";
    }

    @RequestMapping("add")
    public String addProduct()
    {
        return "add_products_form";
    }

    private Product getProductByName(String name)
    {
        for (Product product : fakeProducts)
        {
            if (product.getName().equals(name))
            {
                return product;
            }
        }
        return null;
    }
}









