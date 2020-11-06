package edu.greenriver.sdev.ormpractice;

import edu.greenriver.sdev.ormpractice.entities.Repair;
import edu.greenriver.sdev.ormpractice.entities.Technician;
import edu.greenriver.sdev.ormpractice.repositories.IRepairRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OrmPracticeApplication
{
    public static void main(String[] args)
    {
        //get the application context
        ApplicationContext context = SpringApplication.run(
                OrmPracticeApplication.class, args);
        IRepairRepository repo = context.getBean(IRepairRepository.class);

        //save some repair records to the db (transient)
        Repair fluteRepair = Repair.builder()
            .instrument("flute")
            .cost(50.0)
            .dateAdded(LocalDate.now().toString())
            .completed(true)
            .build();

        Repair clarinetRepair = Repair.builder()
            .instrument("clarinet")
            .cost(20.0)
            .dateAdded(LocalDate.of(2020, 10, 25).toString())
            .completed(true)
            .build();

        Repair repair = Repair.builder()
                .instrument("trombone")
                .completed(false)
                .build();

        List<Repair> repairs = List.of(fluteRepair, clarinetRepair, repair);

        //convert (save) objects as managed objects using JPA
        repo.saveAll(repairs);

        //to update, we change the object and save it!
        fluteRepair.setCompleted(false);
        repo.save(fluteRepair);

        Technician tech = Technician.builder()
            .name("Susie")
            .build();

        clarinetRepair.setTechnician(tech);
        repo.save(clarinetRepair);
    }
}
