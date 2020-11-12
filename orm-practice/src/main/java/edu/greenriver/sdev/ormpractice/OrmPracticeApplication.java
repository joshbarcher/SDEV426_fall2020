package edu.greenriver.sdev.ormpractice;

import edu.greenriver.sdev.ormpractice.entities.Repair;
import edu.greenriver.sdev.ormpractice.entities.Technician;
import edu.greenriver.sdev.ormpractice.repositories.IRepairRepository;
import edu.greenriver.sdev.ormpractice.repositories.ITechnicianRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class OrmPracticeApplication
{
    public static void main(String[] args)
    {
        //get the application context
        ApplicationContext context = SpringApplication.run(
                OrmPracticeApplication.class, args);
        IRepairRepository repairRepo = context.getBean(
                IRepairRepository.class);
        ITechnicianRepository techRepo = context.getBean(
                ITechnicianRepository.class);

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

        Repair tromboneRepair = Repair.builder()
                .instrument("trombone")
                .completed(false)
                .build();

        List<Repair> repairs = List.of(fluteRepair, clarinetRepair, tromboneRepair);

        //convert (save) objects as managed objects using JPA
        repairRepo.saveAll(repairs);

        //to update, we change the object and save it!
        fluteRepair.setCompleted(false);
        repairRepo.save(fluteRepair);

        //create a tech and save them
        Technician techSusie = Technician.builder()
            .name("Susie")
            .build();

        Technician techSvetlana = Technician.builder()
            .name("Svetlana")
            .build();

        List<Technician> techs = List.of(techSusie, techSvetlana);
        techRepo.saveAll(techs);

        //save on the "many" side of the relationship
        clarinetRepair.setTechnician(techSusie);
        tromboneRepair.setTechnician(techSusie);
        fluteRepair.setTechnician(techSvetlana);

        //save on the "one" side of the relationship
        /*techSusie.setRepairs(new ArrayList<>());
        techSusie.getRepairs().add(clarinetRepair);
        techSusie.getRepairs().add(tromboneRepair);

        techSvetlana.setRepairs(new ArrayList<>());
        techSvetlana.getRepairs().add(fluteRepair);*/

        //save the one-to-many objects in the relationship
        repairRepo.save(clarinetRepair);
        repairRepo.save(tromboneRepair);
        repairRepo.save(fluteRepair);

        //get an updated (managed) object from JPA
        Optional<Technician> updatedSusie = techRepo.findById(1);
        if (updatedSusie.isPresent())
        {
            Technician susie = updatedSusie.get();

            for (Repair repair : susie.getRepairs())
            {
                System.out.printf("%s is handling the repair for %s%n",
                        susie.getName(), repair.getInstrument());
            }
        }
    }
}
