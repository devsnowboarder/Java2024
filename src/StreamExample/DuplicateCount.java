package StreamExample;

import java.util.*;
import java.util.stream.Collectors;

    public class DuplicateCount {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(4, 5, 6, 4, 7, 8, 5, 9, 10,4,5,5);

            Map<Integer, Long> duplicates = findDuplicateCounts(numbers);
            System.out.println("Duplicate Counts: " + duplicates);
            // Output: {4=2, 5=2}
        }

        public static Map<Integer, Long> findDuplicateCounts(List<Integer> numbers) {
            return numbers.stream()
                    .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() > 1) // Keep only duplicates
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }
    }


