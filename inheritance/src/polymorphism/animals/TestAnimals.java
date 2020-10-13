package polymorphism.animals;

public class TestAnimals
{
    public static void main(String[] args)
    {
        //use upcasting
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal peacock = new Peacock();

        //call shared methods on the animals
        interact(cat);
        interact(bird);
        interact(peacock);

        //we can't access methods not in animal
        /*cat.useCatSand();
        bird.fly();*/
    }

    public static void interact(Animal animal)
    {
        animal.makeNoise();
        animal.feed();

        //use instanceof to detect the actual type of the
        //object in the variable
        if (animal instanceof Bird)
        {
            Bird bird = (Bird)animal;
            bird.fly();
        }
        else if (animal instanceof Cat)
        {
            Cat cat = (Cat)animal;
            cat.useCatSand();
        }
    }
}
