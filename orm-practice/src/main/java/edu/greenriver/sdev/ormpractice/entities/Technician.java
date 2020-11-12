package edu.greenriver.sdev.ormpractice.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @ToString.Exclude /* don't include this field with the lombok toString() */
    @OneToMany(mappedBy = "technician", fetch = FetchType.EAGER)
    private List<Repair> repairs;
}
