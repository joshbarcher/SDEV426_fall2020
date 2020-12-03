package abstract_factory_pattern.animals.characters;

import abstract_factory_pattern.animals.entities.Caretaker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PokemonCaretakers implements ICaretakers
{
    private Map<String, Caretaker> characters;
    
    public PokemonCaretakers()
    {
        characters = new HashMap<String, Caretaker>();
        
        //load our map
        characters.put("ash", new Caretaker(
                "ash", "trainer"));
        characters.put("misty", new Caretaker(
                "misty", "trainer"));
    }
    
    @Override
    public Map<String, Caretaker> getAllCaretakers()
    {
        return Collections.unmodifiableMap(characters);
    }

    @Override
    public Caretaker getCharacterByName(String fullName)
    {
        if (!characters.containsKey(fullName))
        {
            throw new IllegalArgumentException(
                    "No name of that type exists!");
        }
        
        return characters.get(fullName);
    }
}

