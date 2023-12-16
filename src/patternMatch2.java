import java.util.regex.Pattern;

public class patternMatch2 {
    public static void main(String[] args) {

        // Some strings to test.
        String[] inputs = { "dog", "dance", "cat", "dirt" };

        // Loop over strings and test them.
        for (String input : inputs) {
            boolean b = Pattern.matches("d.+", input);
            System.out.println(b);
        }
    }
}