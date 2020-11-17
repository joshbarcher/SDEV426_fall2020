package shapes.primitives;

public enum ShapeType
{
    ELLIPSE(2),
    RECTANGLE(2),
    LINE(4),
    CIRCLE(1),
    SQUARE(1),
    POINT(2);

    private int numDimensions;

    private ShapeType(int numDimensions)
    {
        this.numDimensions = numDimensions;
    }

    public int getNumDimensions()
    {
        return numDimensions;
    }
}

