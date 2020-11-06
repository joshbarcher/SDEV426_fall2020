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
public class Technician
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer techId;

    private String name;

    @OneToOne(mappedBy = "technician")
    private Repair repair;
}
