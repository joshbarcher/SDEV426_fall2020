package overloading_overriding;

public class Fork extends Utensil
{
    private int numTines;

    public Fork(int numTines)
    {
        this.numTines = numTines;
    }

    public int getNumTines()
    {
        return numTines;
    }

    public void setNumTines(int numTines)
    {
        this.numTines = numTines;
    }

    public void setMaterial(String material, boolean allCaps)
    {
        if (allCaps)
        {
            super.setMaterial(material.toUpperCase());
        }
        else
        {
            super.setMaterial(material);
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + ", a fork with " +
                numTines + " tines";
    }
}
