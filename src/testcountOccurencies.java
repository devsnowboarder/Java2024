import java.util.*;

public class testcountOccurencies {

    public static void main(String[] args ) {

        String Str = "San Francisco California";
        String Str2 = "San Francisco California";

        Set<Character>uniqueSet = new HashSet<Character>();

        char[] Array1 = Str.toCharArray();
        char[] Array2 = Str2.toCharArray();

        System.out.println("Hello World");
        int k = 0;
        int i=0;
        List<String> strList = new ArrayList<>();
        for (char x : Array1) {

            if ( uniqueSet.add(x)) {    // only use if the first string have duplicate characters
                for (char y : Array2) {
                    if (x == y)
                        k = k + 1;

                }
                System.out.println(x + "   " + k);
                k = 0;
            }
        }

        char [] Array3 = Str.toCharArray();
        ArrayList<String>  charList = new ArrayList<>();

        for ( char x: Array3)
            charList.add(" "+x);

        HashSet<String> set = new HashSet<>(charList);

        System.out.println(set);

        for (String x: set)
            System.out.println(x+"   "+Collections.frequency(charList,x));

    }
}

