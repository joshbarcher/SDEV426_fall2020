package car_observers;

import cars.Car;
import pattern.IObserver;

public class TrafficCam implements IObserver<Car>
{
    @Override
    public void update(Car observable, Object... arguments)
    {
        System.out.println("Traffic cam recieved an update from a car.");
        if (arguments.length >= 1 && arguments[0] == Car.CarState.DRIVING)
        {
            System.out.println("Car is at " + observable.getLocation());
        }
    }
}
