import java.util.*;


public class HashExercise2 {

    public static void main(String[] args){

        Hashtable<Integer,String> MikeHash = new Hashtable<>();

        String[] mikeName  ={"mike","joe","jordan","ken","car","car","joe","kim"};


        int key =0;


        for ( int i =0; i < mikeName.length; i ++)
            MikeHash.put(i,mikeName[i]);

        for(Map.Entry entry: MikeHash.entrySet()){
            if(entry.equals(entry.getValue())){
                // key = entry.getKey();
                break; //breaking because its one to one map
            }
        }

        //convert array to a list;

        List<String > names = Arrays.asList(mikeName);

        String mike = MikeHash.get(1);

        for ( int i=0; i < mikeName.length; i++ )
            // prints the name in that index
            System.out.println("Hash =  "+MikeHash.get(i));

        Set<String> mikeSet = new HashSet<String>();


        for (int i =0; i < mikeName.length; i++)
            if ( !mikeSet.add(MikeHash.get(i))) {
                System.out.println("Duplicate");
                System.out.println(MikeHash.get(i));

            }
        System.out.println(Collections.frequency(names,"car"));

    }
}


