package race;

import entities.Runner;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class Race
{
    private String name;
    private LocalDate dayOfRace;
    private Set<Runner> runners = new HashSet<>();

    public Race(String name, LocalDate dayOfRace)
    {
        this.name = name;
        this.dayOfRace = dayOfRace;
    }

    public void register(Runner runner)
    {
        //do something...
    }

    public void raceDay()
    {
        //do something...
    }

    public Runner waitForWinner()
    {
        //do something...
        return null;
    }

    public void validateFallRace()
    {
        //do something...
    }

    public void validateSummerRace()
    {
        //do something...
    }
}

