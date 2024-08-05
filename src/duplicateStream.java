import java.util.*;
import java.util.stream.*;

public class duplicateStream {

    // Function to find the 
    // duplicates in a Stream 
    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream)
    {

        // Set to store the duplicate elements 
        Set<T> items = new HashSet<>();

        // Return the set of duplicate elements 
        return stream.filter(n ->!items.add(n)).collect(Collectors.toSet());
                // Set.add() returns false
                // if the element was
                // already present in the set.
                // Hence filter such elements


                // Collect duplicate elements
                // in the set

    }

    // Driver code 
    public static void main(String[] args)
    {

        // Initial stream 
        Stream<Integer> stream
                = Stream.of(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);

        // Print the found duplicate elements 
        System.out.println(
                findDuplicateInStream(stream));
    }
} 