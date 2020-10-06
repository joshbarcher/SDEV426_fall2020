package exercise;

public class Fruit extends Edible
{
    private double value;

    public Fruit(double value)
    {
        super(true);

        this.value = value;
    }

    public double getValue()
    {
        return value;
    }
}
