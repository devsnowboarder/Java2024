package StreamExample.GroupBy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupByCount {
    public static void main(String[] args)
    {

        // Get the List
        List<String> g
                = Arrays.asList("geeks", "for", "geeks");

        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
                = g.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
    }
}
