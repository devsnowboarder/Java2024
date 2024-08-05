import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class duplicateRemoveCharString {
    public static void main(String[] args) {
        // removes all the duplicates on a string

       // String str = "Exxon";   // output Eon  xx is a duplicate, remove all the duplicate
        String str ="geeksforgeeks";
         Integer[] num ={1,3,4,6,1,4,6,9,12};

        char[] charStr = str.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

      for (char x : charStr)
            charList.add(x);

      for (int xnum : num)
            number.add(xnum);


      HashSet<Character> strSet = new HashSet<>(charList);  // can only use in an ArrayList
        HashSet<Integer> numX = new HashSet<>(number);  // can only use in an ArrayList

        System.out.println(" number list no duplicate" + numX);


        System.out.println(strSet);

       // HashSet<Integer> numSet = new HashSet<Integer>(num);

       for ( Character x2: strSet) {
            // System.out.println(x2 + " " + Collections.frequency(charList, x2));

            if (Collections.frequency(charList, x2) <2)  //remove all the Duplicates
                System.out.print(x2);
        }

       HashSet<Character> strSet2 = new HashSet<>(charList);
       System.out.println(strSet2);

       for ( Character x: strSet2) {
          // System.out.println(x);
           if (Collections.frequency(charList, x) > 1) {  // prints all the duplicate
               System.out.println(" Duplicate   " + x);
           }

       }

    }
}
