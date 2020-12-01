package factory_methods;

import java.util.Random;

public class Color
{
    //components will be in the range [0,255]
    private int red;
    private int green;
    private int blue;

    //this will always lie between [0, 1]
    //where 0 means transparent and 1 opaque
    private double alpha;

    private Color(int red, int green, int blue,
                 double alpha)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    //factory methods go here...

    public static Color random()
    {
        Random random = new Random();

        return new Color(
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256),
            1.0
        );
    }

    public static Color of(int red, int green, int blue,
                           double alpha)
    {
        //verify rgb are within the correct range
        range(0, 255, red, green, blue);

        return new Color(red, green, blue, alpha);
    }

    private static void range(int low, int high, int... values)
    {
        for (int value : values)
        {
            range(low, high, value);
        }
    }

    private static void range(int low, int high, int value)
    {
        if (value < low || value > high)
        {
            throw new IllegalArgumentException("Value invalid");
        }
    }

    public double getRed()
    {
        return red;
    }

    public double getGreen()
    {
        return green;
    }

    public double getBlue()
    {
        return blue;
    }

    public double getAlpha()
    {
        return alpha;
    }

    @Override
    public String toString()
    {
        return "(" + red + "," + green + "," + blue + "," +
                (int)(alpha * 100) + "%)";
    }
}