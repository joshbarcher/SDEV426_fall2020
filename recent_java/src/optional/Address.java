package optional;

public class Address
{
    private String address;

    public Address(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    //create a default Address through a factory method
    public static Address standard()
    {
        return new Address("1000 Apple Tree Lane");
    }
}
