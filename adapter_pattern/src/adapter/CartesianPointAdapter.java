package adapter;

import points.ICartesianPoint;
import points.Point3D;

public class CartesianPointAdapter implements ICartesianPoint
{
    private Point3D adaptee;

    public CartesianPointAdapter(Point3D adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public double getX()
    {
        return adaptee.getXCoord();
    }

    @Override
    public double getY()
    {
        return adaptee.getYCoord();
    }

    @Override
    public String toString()
    {
        return "(" + adaptee.getXCoord() + ", " + adaptee.getYCoord() + ")";
    }
}
