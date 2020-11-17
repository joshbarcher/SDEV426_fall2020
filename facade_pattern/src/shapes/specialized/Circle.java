package shapes.specialized;

import shapes.primitives.Ellipse;
import shapes.primitives.ShapeType;

public class Circle extends Ellipse
{
    public Circle(double radius)
    {
        super(radius, radius);
        setType(ShapeType.CIRCLE);
    }
}
