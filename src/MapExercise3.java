import java.util.Hashtable;
import java.util.Map;

/**
 * Java program to get key from value in Java HashMap, Hashtable and Map.
 *
 * @author java67
 */
public class MapExercise3 {


    public static Hashtable<String,String>   computerListAdd(Hashtable<String,String> items) {

        Hashtable<String,String> table = new Hashtable();

       items.put("Apple","iPhone");

        return items;
    };

    public static void main(String args[]) {

        //how to get key from value in hashtable in Java
        Hashtable<String,String> table = new Hashtable();
        table.put("Sony", "Bravia");
        table.put("Samsung", "Galaxy");
        table.put("Nokia", "Lumia");

        System.out.println("does hash table has Lumia as value : " + table.containsValue("Lumia"));
        System.out.println("does hash table Lumia as key : " + table.containsKey("Lumia"));

        //finding key corresponding to value in hashtable - one to one mapping
        String key= null;
        String value="Lumia";
/*
        for(Map.Entry k: table.entrySet())
        {
            System.out.println(k.getKey()+ "   "+k.getValue());
            if (k.getValue().equals("Lumia")) {
                System.out.println(" found key value " +k.getKey());
            }

        }

        */

        MapExercise3.computerListAdd(table);



       // table.put("Apple","iPhone");
        // table.put("Apple","iPod");

        System.out.println("\n");

        for(Map.Entry k: table.entrySet())
        {
            System.out.println(k.getKey()+ "   "+k.getValue());

        }


/*

        for(Map.Entry entry: table.entrySet()){
            if(value.equals(entry.getValue())){
               // key = entry.getKey();
                break; //breaking because its one to one map
            }
        }
        System.out.println("got key from value in hashtable key:  "+ key +" value: " + value);

        //finding key corresponding to value in hashtable - one to many mapping
        table.put("HTC", "Lumia");
        Set keys = new HashSet();

        for(Map.Entry entry: table.entrySet()){
            if(value.equals(entry.getValue())){
                keys.add(entry.getKey()); //no break, looping entire hashtable
            }
        }
        System.out.println("keys : " + keys +" corresponding to value in hash table:  "+ value);


        //how to get from value in HashMap example - similar to Hashtable example
        HashMap map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);

        //find key from value in HashMap Java - one to one mapping
       Integer intValue=2;
        String strKey = null;
        for(Map.Entry entry: map.entrySet()){
            if(intValue.equals(entry.getValue())){
                strKey = entry.getKey();
                break; //breaking because its one to one map
            }
        }

        System.out.println("key from value in hash table key:  "+ strKey +" value: " + intValue);

        */
    }
}
