package builder;

public class StringBuilderPractice
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        builder
            .append("Hello")
            .append("world")
            .append("!");

        System.out.println(new StringBuilder()
            .append("Hello")
            .append("world")
            .append("!")
            .toString()
        );
    }
}
