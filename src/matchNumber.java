import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class matchNumber {


     static ArrayList<String> dupliclist (String[] number) {

           ArrayList<String> dup = new ArrayList<>();

        Set<String> set1 = new HashSet<>();

        for ( String num: number)
            if (  set1.add(num))
                System.out.println(num);
            else {
                System.out.println(" dubplicate number  " + num);
                dup.add(num);

            }

     return dup;


    };


    public static void main(String arg[]) {

        String[] number = {"1", "4", "6", "0", "2", "7", "9","9","4"};
        System.out.println(matchNumber.dupliclist(number));

    }

}
