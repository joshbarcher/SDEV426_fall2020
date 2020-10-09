package abstract_classes.shapes;

public class Hexagon extends Shape
{
    private double side;

    public Hexagon(double side)
    {
        super("hexagon");
        this.side = side;
    }

    @Override
    public double area()
    {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
    }
}
