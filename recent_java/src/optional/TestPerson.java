package optional;

public class TestPerson
{
    public static void main(String[] args)
    {
        Person me = new Person("Josh", "Archer");
        Address address = me.getAddress().orElse(Address.standard());
        System.out.println(address.getAddress());
    }
}
