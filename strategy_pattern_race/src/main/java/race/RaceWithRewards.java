package race;

import entities.Runner;
import strategies.race_types.IRaceType;
import strategies.registrations.IRegistrationProcess;

import java.time.LocalDate;
import java.util.Arrays;

public class RaceWithRewards extends Race
{
    private IRaceType raceType;

    public RaceWithRewards(String name, LocalDate dayOfRace,
                           IRegistrationProcess registration,
                           IRaceType raceType)
    {
        super(name, dayOfRace, registration);
        this.raceType = raceType;
    }

    @Override
    public void raceDay()
    {
        super.raceDay();

        //put my rewards here...
        Arrays.stream(raceType.getRewards())
            .forEach(reward -> System.out.println("Reward: " + reward));
    }
}
