package polymorphism.animals;

public class Cat extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Meow");
    }

    @Override
    public void feed()
    {
        System.out.println("You feed the cat");
    }

    public void useCatSand()
    {
        System.out.println("Does their duty");
    }
}
