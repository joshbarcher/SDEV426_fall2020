package race;

import entities.Runner;
import lombok.Data;
import strategies.race_types.IRaceType;
import strategies.registrations.IRegistrationProcess;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

@Data
public class Race
{
    private String name;
    private LocalDate dayOfRace;
    private Set<Runner> runners = new HashSet<>();
    private IRegistrationProcess registration;

    public Race(String name, LocalDate dayOfRace,
                IRegistrationProcess registration)
    {
        this.name = name;
        this.dayOfRace = dayOfRace;
        this.registration = registration;
    }

    public void addRunner(Runner runner)
    {
        runners.add(runner);
    }

    public void raceDay()
    {
        System.out.println("Welcome to the " + name + "!");
        System.out.println();

        //make sure only valid runners run
        runners = registration.validateRunners(runners);

        System.out.println("The following runners will take part in the race: ");
        System.out.println("***********************");
        runners.stream().forEach(runner -> System.out.println(runner.getName()));
        System.out.println("***********************");
        System.out.println();

        //simulate the race
        Runner winner = waitForWinner();
        System.out.println(winner.getName() + " wins the race!");
    }

    public Runner waitForWinner()
    {
        //pick the winner
        Random random = new Random();
        Optional<Runner> winner = runners.stream()
            .skip(random.nextInt(runners.size()))
            .findFirst();

        //make sure everything worked out
        if (winner.isPresent())
        {
            return winner.get();
        }
        else
        {
            throw new IllegalStateException("Winner not found!");
        }
    }
}

