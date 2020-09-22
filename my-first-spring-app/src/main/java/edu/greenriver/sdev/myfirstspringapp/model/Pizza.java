package edu.greenriver.sdev.myfirstspringapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Pizza
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pizzaId;

    private int size;
    private boolean thickCrust;
    private String toppings;
}
