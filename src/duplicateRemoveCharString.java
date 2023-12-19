import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class duplicateRemoveCharString {
    public static void main(String[] args) {
        // removes all the duplicates on a string

       // String str = "Exxon";   // output Eon  xx is a duplicate, remove all the duplicate
        String str ="geeksforgeeks";
        // Integer[] num =[1,3,4,6,1,4,6,9,12];


        char[] charStr = str.toCharArray();
        ArrayList<String> charList = new ArrayList<>();
      for (char x : charStr)
            charList.add(" "+x);

      HashSet<String> strSet = new HashSet<>(charList);  // can only use in an ArrayList
      System.out.println(strSet);

       // HashSet<Integer> numSet = new HashSet<Integer>(num);

       for ( String x2: strSet) {
            // System.out.println(x2 + " " + Collections.frequency(charList, x2));

            if (Collections.frequency(charList, x2) <2)  //remove all the Duplicates
                System.out.print(x2);
        }


       System.out.println(" ");

       HashSet<String> strSet2 = new HashSet<>(charList);
       System.out.println(strSet2);

       for ( String x: strSet2) {
          // System.out.println(x);
           if (Collections.frequency(charList, x) > 1) {  // prints all the duplicate
               System.out.println(" Duplicate" + x);
           }

       }

    }
}
