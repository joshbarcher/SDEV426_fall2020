package shapes.primitives;

public class Ellipse extends BaseShape
{
    private double radiusX;
    private double radiusY;

    public Ellipse(double radiusX,
                   double radiusY)
    {
        super(ShapeType.ELLIPSE);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public double getRadiusX()
    {
        return radiusX;
    }

    public void setRadiusX(double radiusX)
    {
        this.radiusX = radiusX;
    }

    public double getRadiusY()
    {
        return radiusY;
    }

    public void setRadiusY(double radiusY)
    {
        this.radiusY = radiusY;
    }

    @Override
    public String toString()
    {
        return "Ellipse{" +
                "radiusX=" + radiusX +
                ", radiusY=" + radiusY +
                '}';
    }
}
