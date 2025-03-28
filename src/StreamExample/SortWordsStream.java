package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortWordsStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedWords); // Output: [apple, banana, cherry, date]

        long size = words.stream().count();

        System.out.println(" Size "+size);
    }
}