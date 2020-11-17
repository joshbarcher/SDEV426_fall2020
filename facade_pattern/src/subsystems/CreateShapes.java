package subsystems;

import shapes.primitives.*;

public class CreateShapes
{
    public Ellipse generateEllipse(double radiusX, double radiusY)
    {
        if (radiusX < 0.0 || radiusY < 0.0)
        {
            throw new RuntimeException("Invalid radius");
        }

        return new Ellipse(radiusX, radiusY);
    }

    public Ellipse generateCircle(double radius)
    {
        return generateEllipse(radius, radius);
    }

    public Rectangle generateRectangle(double length, double width)
    {
        if (length < 0.0 || width < 0.0)
        {
            throw new RuntimeException("Invalid dimensions");
        }

        return new Rectangle(length, width);
    }

    public Rectangle generateSquare(double side)
    {
        return generateRectangle(side, side);
    }

    public Line generateLine(double x1, double y1, double x2, double y2)
    {
        return new Line(x1, y1, x2, y2);
    }

    public Line generatePoint(double x, double y)
    {
        return generateLine(x, y, x, y);
    }

    public Line generateOrigin()
    {
        return generatePoint(0.0, 0.0);
    }
}

