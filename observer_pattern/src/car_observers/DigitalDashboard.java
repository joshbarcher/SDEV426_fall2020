package car_observers;

import cars.Car;
import pattern.IObserver;

public class DigitalDashboard implements IObserver<Car>
{
    @Override
    public void update(Car observable, Object... arguments)
    {
        System.out.println("Digital dashboard received an update!");
        if (arguments.length >= 1 && arguments[0] == Car.CarState.STOPPED)
        {
            System.out.println("Dashboard noticed that the car stopped");
        }
    }
}
