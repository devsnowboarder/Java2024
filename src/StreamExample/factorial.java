package StreamExample;

import java.util.stream.IntStream;

public class factorial {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial for a different value

        // Calculate factorial using IntStream and reduce()
        long factorial = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b); // Multiply each element

        System.out.println("Factorial of " + number + " is: " + factorial);


        long addNumber = IntStream.rangeClosed( 1, number).
                reduce(1, (a,b) -> a + 2);

          System.out.println(addNumber);


          int sumNumber = IntStream.rangeClosed(5,6).reduce(1,(a,b)->a +b);
          System.out.println((sumNumber));


    }
}