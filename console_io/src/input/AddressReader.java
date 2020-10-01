package input;

import java.util.Scanner;

public class AddressReader
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //get address from our user
        System.out.print("Number: ");
        int number = input.nextInt(); //integer
        input.nextLine(); //clear the newline in the scanner buffer

        System.out.print("Street: ");
        String street = input.nextLine(); //string

        System.out.print("City: ");
        String city = input.nextLine(); //string

        System.out.print("State: ");
        String state = input.nextLine(); //string

        System.out.print("Zip: ");
        int zip = input.nextInt(); //integer
        input.nextLine();

        System.out.print("Phone #: ");
        String phone = input.nextLine(); //string

        System.out.printf("%d %s %s, %s %d - %s",
            number, street, city, state, zip, phone);
    }
}