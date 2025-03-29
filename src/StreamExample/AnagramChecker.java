package StreamExample;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnagramChecker {   //  check to see if 2 strings are Anagram
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are they anagrams? " + isAnagram); // Output: true
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, they can't be anagrams
        }

        // boxed is specifically for converting primitive streams to streams of boxed values,
        // while map is a general-purpose method for transforming elements
        // in a stream using a provided function.

        return str1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(str2.chars().sorted().boxed().collect(Collectors.toList()));
    }
}
