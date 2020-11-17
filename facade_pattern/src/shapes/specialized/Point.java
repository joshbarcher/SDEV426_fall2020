package shapes.specialized;

import shapes.primitives.Line;
import shapes.primitives.ShapeType;

public class Point extends Line
{
    public Point(double x, double y)
    {
        super(x, y, x, y);
        setType(ShapeType.POINT);
    }
}
