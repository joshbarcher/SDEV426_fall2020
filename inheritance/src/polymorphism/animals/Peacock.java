package polymorphism.animals;

public class Peacock extends Bird
{
    public void beADiva()
    {
        System.out.println("Peacock spreads feathers");
    }

    @Override
    public void feed()
    {
        System.out.println("The pretty bird eats the food");
    }
}
