package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PalindromFinder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "racecar", "hello", "level", "world", "radar", "java");

        List<String> palindromes = words.stream()
                .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println("Palindromes: " + palindromes);




    }
}