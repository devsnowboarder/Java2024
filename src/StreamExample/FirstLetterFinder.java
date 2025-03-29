package StreamExample;

import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class FirstLetterFinder {
    public static void main(String[] args) {
        String input = " 123!abc"; // Example string

        // Find the first letter using Streams
        Optional<Character> firstLetter = input.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .filter(Character::isLetter) // Filter only letters
                .findFirst(); // Get the first letter

        // Print the result
        firstLetter.ifPresentOrElse(
                letter -> System.out.println("First letter: " + letter),
                () -> System.out.println("No letter found"));
    }
}
