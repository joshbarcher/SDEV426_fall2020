package driver;

import entities.Document;
import entities.Runner;
import race.Race;
import strategies.registrations.FallRegistration;
import strategies.registrations.FreeForAllRegistration;
import strategies.registrations.SimpleFallRegistration;
import strategies.registrations.WinterRegistration;

import java.time.LocalDate;
import java.util.Arrays;

public class TestClasses
{
    public static void main(String[] args)
    {
        Runner[] runners = {
            new Runner("Stan Williams",
                Arrays.asList(new Document("Winter Registration"))),
            new Runner("Michelle Smith",
                Arrays.asList(new Document("Fall Registration"),
                              new Document("Liability Waiver"))),
            new Runner("Tyler Patrick",
                Arrays.asList(new Document("Winter Registration"))),
            new Runner("Jean Davis",
                Arrays.asList(new Document("Fall Registration"))),
            new Runner("Susie Brown",
                Arrays.asList(new Document("Fall Registration"))),
            new Runner("Terry Wilson",
                Arrays.asList(new Document("Fall Registration"),
                              new Document("Liability Waiver")))
        };

        //pass a few strategies for fall races
        Race fallRace = new Race("Breast Cancer Awareness Race",
                LocalDate.of(2020, 9, 15), new FallRegistration());

        Race anotherRace = new Race("Leaves Falling Race!",
                LocalDate.of(2020, 9, 1), new SimpleFallRegistration());

        Race winterRace = new Race("Seattle Jog",
                LocalDate.of(2021, 1, 7), new FreeForAllRegistration());

        Race ironManRace = new Race("Iron Man",
                LocalDate.of(2021, 1, 7), new WinterRegistration());

        //add the runners to each race
        Arrays.stream(runners).forEach(fallRace::addRunner);
        Arrays.stream(runners).forEach(anotherRace::addRunner);
        Arrays.stream(runners).forEach(ironManRace::addRunner);
        Arrays.stream(runners).forEach(winterRace::addRunner);

        //simulate the race day for each race
        anotherRace.raceDay();
        System.out.println();

        fallRace.raceDay();
        System.out.println();

        ironManRace.raceDay();
        System.out.println();

        winterRace.raceDay();
        System.out.println();
    }
}
