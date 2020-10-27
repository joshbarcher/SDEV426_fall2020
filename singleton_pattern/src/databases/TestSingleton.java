package databases;

import java.time.LocalDate;

public class TestSingleton
{
    public static void main(String[] args)
    {
        //this won't work any longer
        //DBConnectionString connectionString = new DBConnectionString();

        //use the singleton getter
        DBConnectionString connectionString = DBConnectionString.getConnection();
        System.out.println(connectionString);

        connectionString = DBConnectionString.getConnection();
        System.out.println(connectionString);
    }
}
