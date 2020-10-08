package overloading_overriding;

public class TestUtensil
{
    public static void main(String[] args)
    {
        Fork myFork = new Fork(4);
        myFork.setMaterial("metal", true);

        System.out.println(myFork);
    }
}
