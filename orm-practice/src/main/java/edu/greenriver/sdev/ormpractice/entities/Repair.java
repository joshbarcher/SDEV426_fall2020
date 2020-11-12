package edu.greenriver.sdev.ormpractice.entities;

import lombok.*;

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
    @Column(name = "dateSubmitted")
    private String dateAdded;
    @Column(name = "isCompleted")
    private boolean completed;

    @Transient
    private boolean partsInStock;

    @ToString.Exclude /* don't include this field with the lombok toString() */
    @ManyToOne
    @JoinColumn(name = "techId")
    private Technician technician;
}













