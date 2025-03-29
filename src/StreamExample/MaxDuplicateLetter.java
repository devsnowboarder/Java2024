package StreamExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxDuplicateLetter {
    public static void main(String[] args) {
        String input = "java programming San Francisco";

        // Find the max occurring letter using Streams
        Optional<Map.Entry<Character, Long>> maxEntry = input.chars()
                .filter(Character::isLetter) // Filter only letters
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()); // Get max by value

        // Print the result
        maxEntry.ifPresent(entry ->
                System.out.println("Most frequent letter: " + entry.getKey() + " (Count: " + entry.getValue() + ")"));




    }
}
