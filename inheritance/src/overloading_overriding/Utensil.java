package overloading_overriding;

public class Utensil
{
    private String material;

    //constructors, getters/setters
    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    @Override
    public String toString()
    {
        return "Utensil made of " + material;
    }
}
