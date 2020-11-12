package edu.greenriver.sdev.ormpractice.services;

import edu.greenriver.sdev.ormpractice.entities.Repair;
import edu.greenriver.sdev.ormpractice.repositories.IRepairRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//BUSINESS LOGIC HERE..... (the rules!)
@Service
public class RepairService
{
    private IRepairRepository repo;

    //using dependency injection here!!!
    public RepairService(IRepairRepository repo)
    {
        this.repo = repo;
    }

    //job of this method is to return all
    //repairs, or throw an exception
    public List<Repair> getAllRepairs()
    {
        List<Repair> repairs = repo.findAll();
        if (repairs.isEmpty())
        {
            throw new IllegalStateException("No repairs found!");
        }
        else
        {
            return repairs;
        }
    }

    public void addNewRepair(Repair repair)
    {
        if (repair.getRepairId() == 0)
        {
            repo.save(repair);
        }
        else
        {
            throw new IllegalStateException("This is a method for insertions, not updates");
        }
    }

    public List<Repair> getCompleted()
    {
        return repo.findAllByCompleted(true);
    }

    public Repair getById(int id)
    {
        return repo.findByRepairId(id).orElse(new Repair());
    }
}
