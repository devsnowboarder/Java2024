package StreamExample;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnagramChecker {
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

        return str1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(str2.chars().sorted().boxed().collect(Collectors.toList()));
    }
}
