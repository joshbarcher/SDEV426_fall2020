package facade;

import shapes.primitives.ShapeType;

public class TestFacade
{
    public static void main(String[] args)
    {
        System.out.println(ShapesFacade.createShape(ShapeType.CIRCLE, 3));
        System.out.println(ShapesFacade.createShape(ShapeType.POINT, 10, 2));
        System.out.println(ShapesFacade.createShape(ShapeType.LINE, -2, 3, 15, 0));
    }
}
