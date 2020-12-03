package abstract_factory_pattern.animals.animals;

import abstract_factory_pattern.animals.entities.Animal;

import java.util.Arrays;
import java.util.List;

public class ZooAnimals implements IAnimals
{
    //other fields, constructors and methods here
    
    @Override
    public List<Animal> getAnimals()
    {
        Animal[] animals = {
                new Animal("lion",
                    new String[] {"king of the jungle", "is furry"}),
                new Animal("bear",
                    new String[] {"likes shade", "loves water"}),
                new Animal("snake",
                    new String[] {"avoids humans"})};
        
        return Arrays.asList(animals);
    }

    @Override
    public void addAnimal(Animal animal)
    {

    }

    @Override
    public void printAnimalStats()
    {

    }
}

