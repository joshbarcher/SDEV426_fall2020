package input;

import console.Console;

import java.util.Scanner;

public class AddressReader
{
    public static void main(String[] args)
    {
        //get address from our user
        int number = Console.readInt("Number: ");
        String street = Console.readString("Street: ");
        String city = Console.readString("City: ");
        String state = Console.readString("State: ");
        int zip = Console.readInt("Zip: ");

        //output our results
        System.out.printf("%d %s %s, %s %d",
            number, street, city, state, zip);
    }
}












