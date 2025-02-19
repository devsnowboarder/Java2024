import java.util.HashSet;

public class duplicatePairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4}; // Example array

        duplicatePairs(arr);
    }

    public static void duplicatePairs(int[] arr) {

        HashSet<String> seenPairs = new HashSet<>(); // To store unique pairs

        HashSet<String> duplicatePairs = new HashSet<>(); // To store duplicates

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Generate a pair using the two elements
                String pair = "(" + arr[i] + "," + arr[j] + ")";
                System.out.println(pair);

                // String pair2 ="(" +arg[i]+","+ arg2[j] +")";
                
                // If the pair has already been seen, add to duplicate pairs
                // use the contains built in function
                if (seenPairs.contains(pair)) {
                    duplicatePairs.add(pair);
                } else {
                    seenPairs.add(pair);
                }
            }
        }

        // Print the duplicate pairs
        System.out.println("Duplicate pairs: " + duplicatePairs);
    }
}