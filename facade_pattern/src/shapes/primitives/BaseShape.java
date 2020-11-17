package shapes.primitives;

public class BaseShape
{
    private ShapeType type;

    public BaseShape(ShapeType type)
    {
        this.type = type;
    }

    public ShapeType getType()
    {
        return type;
    }

    public void setType(ShapeType type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "BaseShape{" +
                "type=" + type +
                '}';
    }
}

