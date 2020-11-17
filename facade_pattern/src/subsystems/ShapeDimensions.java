package subsystems;

import shapes.primitives.*;

public class ShapeDimensions
{
    //ELLIPSE ******************************************

    public double ellipseArea(Ellipse ellipse)
    {
        return ellipse.getRadiusX() * ellipse.getRadiusY() * Math.PI;
    }

    public double ellipseCircumference(Ellipse ellipse)
    {
        //an approximation
        return 2 * Math.PI * Math.sqrt((
            Math.pow(ellipse.getRadiusX(), 2.0) +
            Math.pow(ellipse.getRadiusY(), 2.0)) / 2
        );
    }

    public double circleCircumference(Ellipse circle)
    {
        if (!isCircle(circle))
        {
            throw new RuntimeException("Input is not a circle");
        }

        return 2 * Math.PI * circle.getRadiusX();
    }

    //RECTANGLE ******************************************

    public double rectangleArea(Rectangle rect)
    {
        return rect.getLength() * rect.getWidth();
    }

    public double rectanglePerimeter(Rectangle rect)
    {
        return 2 * rect.getLength() + 2 * rect.getWidth();
    }

    //LINE ******************************************

    public double distance(Line line)
    {
        return Math.sqrt(
            Math.pow(line.getX1() - line.getX2(), 2.0) +
            Math.pow(line.getY1() - line.getY2(), 2.0)
        );
    }

    //IDENTITY ******************************************

    public boolean isCircle(Ellipse ellipse)
    {
        return ellipse.getRadiusX() == ellipse.getRadiusY();
    }

    public boolean isSquare(Rectangle rectangle)
    {
        return rectangle.getLength() == rectangle.getWidth();
    }

    public boolean isPoint(Line line)
    {
        return line.getX1() == line.getX2() &&
               line.getY1() == line.getY2();
    }
}

