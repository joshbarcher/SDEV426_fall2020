package abstract_factory_pattern.animals.entities;

import java.util.Arrays;

public class Animal
{
    private String name;
    private String[] characteristics;
    
    public Animal(String name, String[] characteristics)
    {
        this.name = name;
        this.characteristics = characteristics;
    }
    
    //getters/setters
    public String getName() {
        return name;
    }
    public String[] getCharacteristics() {
        return characteristics;
    }
    
    @Override
    public String toString() {
        return "Animal [name=" + name +
                ", characteristics=" +
                Arrays.toString(characteristics) + "]";
    }
}

