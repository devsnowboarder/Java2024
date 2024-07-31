import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapDuplicatePairs {




        public static void main(String [] args)

        {

            HashMap<String ,String> m = new HashMap<>();
            HashSet<String> set =new HashSet<String>();

            String[] Arr = {"a", "b","c","d","a"};

            for(String key :Arr)
                m.put(key,"Present");

            for (Map.Entry m2:m.entrySet()) {

                System.out.println(m2.getKey()+" "+m2.getValue());
            }

            String test;

            for (Map.Entry m2:m.entrySet()){
                System.out.println(m2.getValue());
                if ( !set.add(m2.getValue().toString()));



            }

            System.out.println(set);



        }


}
