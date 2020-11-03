package edu.greenriver.sdev.ormpractice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Repair
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int repairId;

    private String instrument;
    private double cost;
    private String fixedDate;
    private boolean completed;
}













