package inheritance;

public class Dog extends Animal
{
    //fields
    private String tailType;
    private String breed;
    private String name;

    //constructors
    public Dog()
    {
        //default for the parent class
        super("0", true);

        //defaults for the child class
        tailType = "short";
        breed = "Golden Retriever";
        name = "Biscuit";
    }

    //methods
    public String getTailType()
    {
        return tailType;
    }

    public String getBreed()
    {
        return breed;
    }

    public String getName()
    {
        return name;
    }
}







