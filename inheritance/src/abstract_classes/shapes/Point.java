package abstract_classes.shapes;

public class Point extends Line
{
    public Point(double x, double y)
    {
        super(x, y, x, y);
    }

    @Override
    public double area()
    {
        return 1;
    }
}
