import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class howmanyAlist_Blist {
    public static void main(String[] args) {
        
        int[] listA = {1, 3, 4, 6, 7, 9,4,6};
        int[] listB = {1, 2, 4, 5, 6, 2,};


        Set<Integer> listAA = new HashSet<Integer>();
        Set<Integer> listBB = new HashSet<Integer>();

 // need to store it on a list to use Collections library

        for (int x : listB)   // remove the duplicates in list B
            listBB.add(x);
        System.out.println( " "+ listBB);

        for (int y: listA)
                listAA.add(y);   // remove the duplicate

   for( Integer x: listBB )
      if (Collections.frequency(listAA,x) >0 )
          System.out.println( x  );

   System.out.println(" second method ");

   for ( Integer x: listBB)
          if ( ! listAA.add(x))
              System.out.println(x);


    }

}
