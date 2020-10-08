package exercise;

public class Edible
{
    private boolean tasty;

    public Edible()
    {
        super();
        tasty = true;
    }

    public Edible(boolean tasty)
    {
        this.tasty = tasty;
    }

    public boolean isTasty()
    {
        return tasty;
    }
}
