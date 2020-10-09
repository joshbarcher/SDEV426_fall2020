package abstract_classes.shapes;

public class TestShapes
{
    public static void main(String[] args)
    {
        //Shape shape = new Shape("Rhombus");
        Circle circle = new Circle(9.7);
        Rectangle rect = new Rectangle(10, 2);
        Hexagon hex = new Hexagon(4);
        Point point = new Point(3, 4);

        //System.out.println(shape.area()); //?!?!
        System.out.println(circle.area());
        System.out.println(rect.area());
        System.out.println(hex.area());
        System.out.println(point.area());
    }
}
