package abstract_factory_pattern.animals.factories;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.animals.ZooAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;
import abstract_factory_pattern.animals.characters.ZooCaretakers;

public class ZooFactory implements IProgramFactory
{
    @Override
    public IAnimals getAnimalsProvider()
    {
        return new ZooAnimals();
    }

    @Override
    public ICaretakers getCaretakersProvider()
    {
        return new ZooCaretakers();
    }
}
