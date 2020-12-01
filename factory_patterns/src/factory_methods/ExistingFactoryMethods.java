package factory_methods;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExistingFactoryMethods
{
    public static void main(String[] args)
    {
        LocalDate epoch = LocalDate.EPOCH;
        LocalDate newYears = LocalDate.of(2021, 1, 1); //<-- factory method
        LocalDate today = LocalDate.now();

        System.out.println(epoch);
        System.out.println(newYears);
        System.out.println(today);

        int[] nums = {1, 2, 3};

        Arrays.stream(nums).average(); //Arrays.stream() is a factory method
        Optional<Integer> optional = Optional.of(10); //Optional.of() is a factory method
        String numberAsString = String.valueOf(true); //String.valueOf() is a factory method
        List<String> favWords = List.of("bamboozle", "stargazed"); //List.of() is a factory method

        //generate 5 colors with my factory method
        for (int i = 1; i <= 5; i++)
        {
            Color randomColor = Color.random();
            System.out.println(randomColor);
        }

        System.out.println(Color.of(1, 75, 20, 0.3754));
    }
}
