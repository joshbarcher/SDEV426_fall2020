package edu.greenriver.sdev.ormpractice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "InstrumentRepair")
public class Repair
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int repairId;

    @Column(name = "instrumentName")
    private String instrument;
    @Column(name = "instrumentCost")
    private double cost;
    @Column(name = "fixedOnDate")
    private String fixedDate;
    @Column(name = "isCompleted")
    private boolean completed;

    @Transient
    private boolean partsInStock;
}













