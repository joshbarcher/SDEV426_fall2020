package abstract_factory_pattern.animals.animals;

import abstract_factory_pattern.animals.entities.Animal;

import java.util.List;

public interface IAnimals
{
    List<Animal> getAnimals();
    void addAnimal(Animal animal);
    void printAnimalStats();
}

