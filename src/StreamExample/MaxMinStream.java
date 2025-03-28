package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15);

        // Find max number
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);

        // Find min number
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);

        // Print results
        System.out.println("Max number: " + maxNumber.orElseThrow()); // Output: 40
        System.out.println("Min number: " + minNumber.orElseThrow()); // Output: 5

        int diff = maxNumber.orElseThrow() - minNumber.orElseThrow();

        System.out.println(diff);
    }
}
