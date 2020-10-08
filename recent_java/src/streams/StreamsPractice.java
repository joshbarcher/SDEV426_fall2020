package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsPractice
{
    public static void main(String[] args)
    {
        List<String> songs = List.of(
            "Cocoa Butter Kisses",
            "Fever the Ghost",
            "Save me",
            "O Green World",
            "Freak",
            "Freak",
            "Freak",
            "Freak",
            "How about",
            "Mad World",
            "Mad World",
            "Roses",
            "Yellow Submarine"
        );

        songs.stream()
            .map(song -> song.toLowerCase())
            .sorted()
            .distinct()
            .forEach(System.out::println);

        int[] nums = {1, 3, 5, 7, 9};
        double average = Arrays.stream(nums)
            .average()
            .orElse(0);
        System.out.println("Average: " + average);
    }

    public String changeSong(String song)
    {
        return song.toLowerCase();
    }
}










