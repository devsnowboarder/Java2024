package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class dublicateItems {

    public static ArrayList<String> duplicateNumber(ArrayList<String> Elements) {

        HashSet<String> set =new HashSet<String>(Elements);
        ArrayList<String> dup = new ArrayList<>();


        System.out.print("ArrayList After Removing Duplicate Elements :");
        System.out.println(set);

        for ( String x: set) {
          //  System.out.println(x + "  " + Collections.frequency(Elements, x));
            if (Collections.frequency(Elements, x) > 1) {
                System.out.println(x + " duplicate");
                dup.add(x);
            }
        }


        return dup;


    };
}
