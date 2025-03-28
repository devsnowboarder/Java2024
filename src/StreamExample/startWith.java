package StreamExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class startWith {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "Abob", "charlie");
            List<String> result = names.stream()
                    .filter(s -> s.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("Start with  " + result);

    }
}
