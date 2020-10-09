package abstract_classes.shapes;

public abstract class Line extends Shape
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line(double x1, double y1,
                double x2, double y2)
    {
        super("line");

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
