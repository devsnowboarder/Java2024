import java.util.*;


public class MikeStuff {

    public static void main(String[] args) {

        int[] mike = {1, 2, 3, 4,6,9};
        int[] match = {2,4};

        List<Integer> mikeSort = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();


        System.out.println(mike[2]);

        for ( int k:mike)
            set.add(k);

        Collections.sort(mikeSort);

        System.out.println(mikeSort);

        // solotuion is wrong !!!  need to use 2 for loops

        int i=0;

        for (Integer j:match) {
            System.out.println(j);

            if ( ! set.add(j))
                mike[i] = -1;
            else
                i++;
        }

        for (  i =0; i < mike.length; i++)
            System.out.print(mike[i]);


        String str = "California";

        char [] test = str.toCharArray();
        List<String>  strList = new ArrayList<>();

        for (Character x: test)
            strList.add(" "+x);

        HashSet<String> Set = new HashSet<>(strList);

        for ( String strx: strList)
              System.out.println(strx+ "   "+Collections.frequency(strList,strx));












    }
}