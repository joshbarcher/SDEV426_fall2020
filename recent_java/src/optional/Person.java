package optional;

import java.util.Optional;

public class Person
{
    //goal is that these are never null!
    private String fName;
    private String lName;
    private Optional<Address> address;

    public Person(String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;

        //set a default value for address
        address = Optional.empty();
    }

    public Person(String fName, String lName, Address address)
    {
        this.fName = fName;
        this.lName = lName;
        this.address = Optional.ofNullable(address);
    }

    public String getfName()
    {
        return fName;
    }

    public String getlName()
    {
        return lName;
    }

    public Optional<Address> getAddress()
    {
        return address;
    }
}
