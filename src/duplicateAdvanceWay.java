import java.util.*;
import java.util.stream.Collectors;



public class duplicateAdvanceWay {
    public static <T> Set<T> findDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();

        return list.stream().filter( e -> !seen.add(e)).collect(Collectors.toSet());
    }

    public static <T> void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "date");


        System.out.println("Duplicate Items: " + findDuplicates(items));

        Set<T> seen = new HashSet<>();

        Set<T> list = null;

      // list.stream().filter( e -> !seen.add(e)).collect(Collectors.toSet());


    }


}