package abstract_factory_pattern.animals.test;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;
import abstract_factory_pattern.animals.entities.Animal;
import abstract_factory_pattern.animals.entities.Caretaker;
import abstract_factory_pattern.animals.factories.IProgramFactory;
import abstract_factory_pattern.animals.factories.PokemonFactory;
import abstract_factory_pattern.animals.factories.ZooFactory;

import java.util.Map;

public class TestProgram
{
    public static void main(String[] args)
    {
        IProgramFactory factory = new PokemonFactory();

        //see what animals are available to my program
        IAnimals animals = factory.getAnimalsProvider();
        for (Animal animal : animals.getAnimals())
        {
            System.out.println(animal);
        }
        System.out.println();

        ICaretakers caretakers = factory.getCaretakersProvider();
        Map<String, Caretaker> caretakerMap = caretakers.getAllCaretakers();

        for (Map.Entry<String, Caretaker> pair : caretakerMap.entrySet())
        {
            System.out.println(pair.getValue().getFullName() + ": " +
                               pair.getValue().getPosition());
        }
    }
}
