package abstract_factory_pattern.animals.characters;

import abstract_factory_pattern.animals.entities.Caretaker;

import java.util.Map;

public interface ICaretakers
{
    public Map<String, Caretaker> getAllCaretakers();
    public Caretaker getCharacterByName(String fullName);
}

