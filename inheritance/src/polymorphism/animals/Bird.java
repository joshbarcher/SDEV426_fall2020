package polymorphism.animals;

public class Bird extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Squack");
    }

    @Override
    public void feed()
    {
        System.out.println("You feed the bird");
    }

    public void fly()
    {
        System.out.println("The bird flies");
    }
}
