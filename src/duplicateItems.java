import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class duplicateItems
{


    //char[] s1Array = copyOfs1.toLowerCase().toCharArray();
    //
    //char[] s2Array = copyOfs2.toLowerCase().toCharArray();
    //

    public static ArrayList<String>  duplicateNumber(ArrayList<String> Elements) {

        HashSet<String>  set =new HashSet<String>(Elements);

        ArrayList<String> dup = new ArrayList<>();


        System.out.print("ArrayList After Removing Duplicate Elements :");
        System.out.println(set);

        for ( String x: set) {
           // System.out.println(x + "  " + Collections.frequency(Elements, x));
            if (Collections.frequency(Elements, x) > 1) {
                System.out.println(x + " duplicate");
                dup.add(x);
            }
        }

        return dup;
    };

    public static void main(String[] args)
    {
        //Constructing An ArrayList

        ArrayList<String> Elements = new ArrayList<String>();

        Elements.add("JAVA");
        Elements.add("J2EE");
        Elements.add("JSP");
        Elements.add("SERVLETS");
        Elements.add("JAVA");
        Elements.add("STRUTS");
        Elements.add("JSP");

        System.out.println(Elements);

        System.out.println(" ");


        HashSet<String> elementSet = new HashSet<>(Elements);  // remove all the duplicate
          // Elements is declared as a list of array string
        System.out.print("ArrayList After Removing Duplicate Elements :");


        System.out.println(elementSet);

        for ( String x: elementSet) {

            if (Collections.frequency(Elements, x) > 1)
                System.out.println(x + " duplicate");
        }
        System.out.println("  ");

        Iterator<String> itr = Elements.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println(duplicateItems.duplicateNumber(Elements));



    }
}