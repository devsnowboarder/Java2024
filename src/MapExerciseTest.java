import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;


public class MapExerciseTest {


    public static Hashtable<Integer, String> addList(String[] cars) {


        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();

        for ( int i=0; i < cars.length;i++ ){
            ht.put(i,cars[i]);
        }

        ArrayList<String> carlist = new ArrayList<>();

        for (Map.Entry m:ht.entrySet())
        {
            System.out.println(m.getKey()+"  test " +m.getValue());
            if ( m.getValue()=="hummer")
                System.out.println(" Found a hummer");
        }



        return ht;
    };

    public static void main(String arg[]){





        String[] cars ={"bmw","toyota","proche","hummer"};

        System.out.println(MapExerciseTest.addList(cars));


    }
}
