package console;

import java.util.Scanner;

public class Console
{
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt)
    {
        //prompt, read, and clear the scanner
        System.out.print(prompt);

        int result = 0; //assign a placeholder value
        while (!scanner.hasNextInt())
        {
            System.out.print("Please enter a valid number: ");
            scanner.nextLine(); //clear the scanner
        }

        result = scanner.nextInt();
        scanner.nextLine(); //clear the scanner

        return result;
    }

    public static boolean readBoolean(String prompt)
    {
        //prompt, read, and clear the scanner
        System.out.print(prompt);
        boolean result = scanner.nextBoolean();
        scanner.nextLine(); //clear the scanner
        return result;
    }

    public static double readDouble(String prompt)
    {
        //prompt, read, and clear the scanner
        System.out.print(prompt);
        double result = scanner.nextDouble();
        scanner.nextLine(); //clear the scanner
        return result;
    }

    public static String readString(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
