package planes;

import points.ICartesianPoint;

import java.util.ArrayList;
import java.util.List;

public class CartesianPlane
{
    private List<ICartesianPoint> points;

    public CartesianPlane()
    {
        points = new ArrayList<>();
    }

    public void add(ICartesianPoint point)
    {
        points.add(point);
    }

    public void print()
    {
        points.stream().forEach(System.out::println);
    }
}
