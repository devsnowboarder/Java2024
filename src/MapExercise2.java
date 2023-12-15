import java.util.Hashtable;
import java.util.Map;


public class MapExercise2 {



    public static Hashtable<String,Integer>   carList(Hashtable<String,Integer> items) {

        String [] itemlist = {"computer","printer,","mouse","monotor,","keyboard","printer"};


        for (Map.Entry m:items.entrySet()) {

            System.out.println(m.getKey()+" "+m.getValue());
        }

             return items;
    };


    public static void main(String args[]) {

       String [] itemlist = {"computer","printer,","mouse","monotor,","keyboard","printer"};

        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();    //Hashtable does notS

        int items = itemlist.length;

        for ( int i = 0 ; i <  items; i++)
        {
            ht.put(itemlist[i],i);
        }

          carList(ht);



    }



}
