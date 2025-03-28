package StreamExample;

import java.util.stream.Collectors;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
        System.out.println("Reversed Number: " + reversed); // Output: 54321

       //harder method

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber); // Output: 54321
    }



    public static int reverseNumber(int num) {
        String reversedString = String.valueOf(num)
                .chars()  // Convert to IntStream
                .mapToObj(c -> (char) c)  // Convert int to Character
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    java.util.Collections.reverse(list);
                    return list.stream();
                }))
                .map(String::valueOf)  // Convert back to String
                .collect(Collectors.joining());

        return Integer.parseInt(reversedString);
    }
}