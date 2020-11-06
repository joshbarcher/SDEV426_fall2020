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
    private Integer repairId;

    @Column(name = "instrumentName")
    private String instrument;
    @Column(name = "instrumentCost")
    private double cost;
    @Column(name = "dateSubmitted")
    private String dateAdded;
    @Column(name = "isCompleted")
    private boolean completed;

    @Transient
    private boolean partsInStock;

    @OneToOne
    @JoinColumn(name = "techId")
    private Technician technician;
}













