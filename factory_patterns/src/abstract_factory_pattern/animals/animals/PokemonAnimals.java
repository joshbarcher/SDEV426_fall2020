package abstract_factory_pattern.animals.animals;

import abstract_factory_pattern.animals.entities.Animal;

import java.util.Arrays;
import java.util.List;

public class PokemonAnimals implements IAnimals
{
    @Override
    public List<Animal> getAnimals()
    {
        Animal[] pokemon = {
                new Animal("charizard",
                    new String[] {"breathes fire", "looks cool"}),
                new Animal("blastoise",
                    new String[] {"shoots a hydro cannon"}),
                new Animal("bulbasaur",
                    new String[] {"green", "cute"}),
                new Animal("snorlax",
                    new String[] {"sleep", "snore"})};

        return Arrays.asList(pokemon);
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

