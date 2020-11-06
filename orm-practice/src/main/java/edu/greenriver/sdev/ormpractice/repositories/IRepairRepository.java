package edu.greenriver.sdev.ormpractice.repositories;

import edu.greenriver.sdev.ormpractice.entities.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //don't forget to mark this class as a bean!
public interface IRepairRepository extends JpaRepository<Repair, Integer>
{
    List<Repair> findAllByCompleted(boolean completed);
    Optional<Repair> findByRepairId(int id);
}
