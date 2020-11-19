package points;

public class Point2D implements ICartesianPoint
{
    private double x, y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX()
    {
        return x;
    }

    @Override
    public double getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
