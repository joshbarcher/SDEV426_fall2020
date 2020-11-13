package console;

import car_observers.TrafficCam;
import cars.Car;

public class Program
{
    public static void main(String[] args)
    {
        //creating an observable
        Car myCar = new Car("Nissan", "Sentra");

        //connect observer to observable
        myCar.addObserver(new TrafficCam());
        myCar.addObserver(new TrafficCam());

        //do something interesting!
        myCar.drive("Seattle");
    }
}
