package abstract_classes.shapes;

public abstract class Shape
{
    private String name;

    public Shape(String name)
    {
        this.name = name;
    }

    public abstract double area();
}

