package inheritance;

public class TestClasses
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        System.out.println(myDog.getBreed());
        System.out.println(myDog.getBloodType());

        Dog anotherDog = new Dog("short", "pug", "Bert");
        System.out.println(anotherDog);

        Dog evenAnother = new Dog("Fluffy", "Bert");
    }
}
