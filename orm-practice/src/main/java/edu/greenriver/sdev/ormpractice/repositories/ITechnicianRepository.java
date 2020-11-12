package edu.greenriver.sdev.ormpractice.repositories;

import edu.greenriver.sdev.ormpractice.entities.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITechnicianRepository extends JpaRepository<Technician, Integer>
{
}
