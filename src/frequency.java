import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class frequency {
    public static void main(String[] args) {

        String str = "Exxon";
       // Integer[] num =[1,3,4,6,1,4,6,9,12];

        char[] charStr = str.toCharArray();

        ArrayList<Character> charList = new ArrayList<>();

        for (char x : charStr)
            charList.add(x);

        HashSet<Character> strSet = new HashSet<>(charList); // remove all duplicates

       // HashSet<Integer> numSet = new HashSet<Integer>(num);

        for ( Character x2: strSet) {
           // System.out.println(x2 + " " + Collections.frequency(charList, x2));
            
            if (Collections.frequency(charList, x2)  < 2)
                System.out.print(x2);
        }

       // System.out.println(Collections.max(charList));
       // System.out.println(".."+Collections.min(charList));

    }
}
