package StreamExample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseStringList{
    public static void main(String[] args) {
        // List of strings
        List<String> words = Arrays.asList("Java", "Stream", "API", "Reverse");

        // Reverse the order of elements
        List<String> reversedList = IntStream.range(0, words.size())
                .mapToObj(i -> words.get(words.size() - 1 - i))
                .collect(Collectors.toList());

        System.out.println("Original List: " + words);
        System.out.println("Reversed List: " + reversedList);

        // Reverse each string inside the list
        List<String> reversedStrings = words.stream()
                .map(str -> new StringBuilder(str).reverse().toString()) // Reverse each string
                .collect(Collectors.toList());

        System.out.println("Reversed Strings: " + reversedStrings);

        for(int i=0 ; i <  reversedStrings.size() ; i++)
            System.out.println(reversedStrings.get(i));
    }
}
