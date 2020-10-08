package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FunWithLambdas
{
    public static void main(String[] args)
    {
        ICalculate calculator = n -> {
            if (n > 0)
            {
                return n - 1;
            }
            return n;
        };
        System.out.println(calculator.doSomething(10));

        calculator = n -> n * 2;
        System.out.println(calculator.doSomething(10));
        System.out.println();

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.stream()
            .map(NumberHolder::new)
            .forEach(nh -> nh.printMe()); //we now have 5 NumberHolders

        String[] names = {"Steve", "Bob", "Melvin", "Maybell", "Susie", "Melanie"};

        List<String> namesList = Arrays.stream(names)
            .sorted()
            .filter(name -> !name.startsWith("M"))
            .collect(Collectors.toList());

        namesList.stream()
            .forEach(System.out::println);

        OptionalInt result = Arrays.stream(new int[] {1, 2, 3, 4, 5})
            .reduce((a, b) -> a + b);

        if (result.isPresent())
        {
            System.out.println(result.getAsInt());
        }
    }
}








