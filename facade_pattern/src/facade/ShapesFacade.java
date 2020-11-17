package facade;

import shapes.primitives.BaseShape;
import shapes.primitives.ShapeType;
import subsystems.CreateShapes;

import java.util.Map;

public class ShapesFacade
{
    public static BaseShape createShape(ShapeType type, double... dimensions)
    {
        if (type.getNumDimensions() != dimensions.length)
        {
            throw new IllegalArgumentException("Number of shape dimensions " +
                    "does not match the shape type");
        }

        CreateShapes creator = new CreateShapes();

        switch (type)
        {
            case ELLIPSE:
                return creator.generateEllipse(dimensions[0], dimensions[1]);
            case RECTANGLE:
                return creator.generateRectangle(dimensions[0], dimensions[1]);
            case LINE:
                return creator.generateLine(dimensions[0], dimensions[1],
                        dimensions[2], dimensions[3]);
            case CIRCLE:
                return creator.generateCircle(dimensions[0]);
            case SQUARE:
                return creator.generateSquare(dimensions[0]);
            case POINT:
                return creator.generatePoint(dimensions[0], dimensions[1]);
            default:
                throw new IllegalStateException("Shape not recognized!");
        }
    }
}
