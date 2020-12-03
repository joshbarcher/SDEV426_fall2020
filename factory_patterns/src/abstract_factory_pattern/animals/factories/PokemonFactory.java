package abstract_factory_pattern.animals.factories;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.animals.PokemonAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;
import abstract_factory_pattern.animals.characters.PokemonCaretakers;

public class PokemonFactory implements IProgramFactory
{
    @Override
    public IAnimals getAnimalsProvider()
    {
        return new PokemonAnimals();
    }

    @Override
    public ICaretakers getCaretakersProvider()
    {
        return new PokemonCaretakers();
    }
}
