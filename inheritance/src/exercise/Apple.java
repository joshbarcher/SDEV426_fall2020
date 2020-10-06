package exercise;

public class Apple extends Fruit
{
    private String type;

    public Apple(double value, String type)
    {
        super(value);

        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}
