package builder;

public class Apple
{
    private String type;
    private double value;

    public Apple(String type, double value)
    {
        this.type = type;
        this.value = value;
    }

    public String getType()
    {
        return type;
    }

    public double getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "Apple{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
