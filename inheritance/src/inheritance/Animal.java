package inheritance;

public class Animal
{
    //fields
    private String bloodType;
    private boolean fur;

    //constructors
    public Animal()
    {
        bloodType = "0";
        fur = true;
    }

    public Animal(String bloodType, boolean fur)
    {
        this.bloodType = bloodType;
        this.fur = fur;
    }

    //methods
    public String getBloodType()
    {
        return bloodType;
    }

    public boolean hasFur()
    {
        return fur;
    }
}
