package points;

//subject to the open-closed principle (do not edit!)
public class Point3D
{
    private double x, y, z;

    public Point3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getXCoord()
    {
        return x;
    }

    public double getYCoord()
    {
        return y;
    }

    public double getZCoord()
    {
        return z;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
