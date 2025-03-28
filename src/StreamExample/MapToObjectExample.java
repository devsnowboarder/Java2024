package StreamExample;
import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

public class MapToObjectExample {
    public static void main(String[] args) {
        // Convert numbers 1 to 5 into a list of strings using mapToObj
        List<String> stringList = IntStream.rangeClosed(1, 5)
                .mapToObj(i -> "Number: " + i)  // Convert each int to String
                .collect(Collectors.toList());

        System.out.println(stringList);


        List<String> listPlus2 = IntStream.rangeClosed(1,5)
                 .mapToObj(i-> "numbers " + i +2)
                .collect(Collectors.toList());

        System.out.println(listPlus2);


    }
}
