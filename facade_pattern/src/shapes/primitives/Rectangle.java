package shapes.primitives;

public class Rectangle extends BaseShape
{
    private double length;
    private double width;

    public Rectangle(double length,
                     double width)
    {
        super(ShapeType.RECTANGLE);
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
