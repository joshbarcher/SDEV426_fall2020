package cars;

import pattern.Observable;

//by extending from Observable we gain all functionality
//to track and inform IObserver objects
public class Car extends Observable
{
    private String make;
    private String model;
    private String location = "Home";

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public String makeAndModel()
    {
        return make + " " + model;
    }

    public void start()
    {
        //System.out.printf("You start a %s%n", makeAndModel());
        updateObservers(CarState.STARTED);
    }

    public void stop()
    {
        //System.out.printf("You stop a %s%n", makeAndModel());
        updateObservers(CarState.STOPPED);
    }

    public void drive(String somewhere)
    {
        location = somewhere;
        //System.out.printf("You drive the %s to %s.%n", makeAndModel(), somewhere);
        updateObservers(CarState.DRIVING);
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getLocation()
    {
        return location;
    }

    public enum CarState
    {
        STOPPED,
        STARTED,
        DRIVING
    }
}
