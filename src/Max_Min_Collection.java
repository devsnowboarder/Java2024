import java.util.Arrays;
import java.util.Collections;

public class Max_Min_Collection {
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 6, 7, 0, 1, 4, 9, 5, 3 };

        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);


        int diff = max-min;

        System.out.println(diff);
    }
}
