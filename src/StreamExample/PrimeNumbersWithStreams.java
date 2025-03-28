package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersWithStreams {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23);

        // Filter prime numbers using Streams
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbersWithStreams::isPrime) // Use method reference to check prime
                .collect(Collectors.toList()); // Collect into a list

        System.out.println("Prime Numbers: " + primeNumbers);
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0); // Ensure no divisors exist
    }
}