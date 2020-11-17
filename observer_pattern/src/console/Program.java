package console;

import car_observers.DigitalDashboard;
import car_observers.TrafficCam;
import cars.Car;

public class Program
{
    public static void main(String[] args)
    {
        //creating an observable
        Car myCar = new Car("Nissan", "Sentra");
        Car anotherCar = new Car("Nissan", "Rogue");

        //connect observer to observable
        TrafficCam cam = new TrafficCam();
        myCar.addObserver(cam);
        myCar.addObserver(new DigitalDashboard());
        anotherCar.addObserver(cam);

        //do something interesting!
        myCar.drive("Seattle");
        myCar.stop();
        anotherCar.drive("Portland");
    }
}
