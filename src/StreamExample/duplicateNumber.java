package StreamExample;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateNumber {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 7, 8, 1, 9, 10, 3);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n)) // add() returns false if already present
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);
    }
}