package abstract_classes.shapes;

public class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        super("circle");
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
}

