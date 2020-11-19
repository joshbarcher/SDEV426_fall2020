package test;

import adapter.CartesianPointAdapter;
import planes.CartesianPlane;
import points.Point2D;
import points.Point3D;

public class TestAdapter
{
    public static void main(String[] args)
    {
        CartesianPlane plane = new CartesianPlane();

        //verify that I can only add 2D points
        plane.add(new Point2D(2, 5));
        plane.add(new Point2D(1, -2));
        plane.add(new Point2D(0, 0));
        plane.add(new CartesianPointAdapter(new Point3D(1, -10, 0)));
        plane.add(new CartesianPointAdapter(new Point3D(2, 15, 3)));

        plane.print();
    }
}
