package car_observers;

import cars.Car;
import pattern.IObserver;

public class TrafficCam implements IObserver
{
    @Override
    public void update(Object observable, Object... arguments)
    {
        Car car = (Car)observable;
        System.out.println("Recieved an update from a Car");
        System.out.println("Car is at " + car.getLocation());
    }
}
