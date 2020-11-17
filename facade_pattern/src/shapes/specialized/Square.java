package shapes.specialized;

import shapes.primitives.Rectangle;
import shapes.primitives.ShapeType;

public class Square extends Rectangle
{
    public Square(double side)
    {
        super(side, side);
        setType(ShapeType.SQUARE);
    }
}
