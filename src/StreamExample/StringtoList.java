package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringtoList {
    public static void main(String[] args) {
        String input = "apple banana orange";

        List<String> list = Arrays.stream(input.split(" "))
                .collect(Collectors.toList());

        System.out.println(list); // Output: [apple, banana, orange]

        for ( int i =0 ; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}