package abstract_factory_pattern.animals.factories;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;

public interface IProgramFactory
{
    IAnimals getAnimalsProvider();
    ICaretakers getCaretakersProvider();
}
