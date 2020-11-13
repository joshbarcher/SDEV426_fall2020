package pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Observable
{
    private Set<IObserver> observers;

    public Observable()
    {
        observers = new HashSet<>();
    }

    //storing and managing observers...

    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer)
    {
        if (!observers.contains(observer))
        {
            throw new IllegalArgumentException("Missing observer");
        }

        observers.remove(observer);
    }

    //send messages to observers...

    public void updateObservers()
    {
        updateObservers(new Object[0]);
    }

    public void updateObservers(Object... arguments)
    {
        //tell all observers that "something" interesting happened
        for (IObserver observer : observers)
        {
            observer.update(this, arguments);
        }
    }
}









