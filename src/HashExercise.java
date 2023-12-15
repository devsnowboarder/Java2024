import java.util.*;


public class HashExercise {


    public static List<Character> sortList ( char [] list) {

        List <Character> cList = new ArrayList<>();

        for (char ch : list)
            cList.add(ch);

        Collections.sort(cList);

        return cList;

    }

    public static Hashtable<Integer, String> hashTableTest( Hashtable<Integer,String> hashData,  Integer index,String firstName) {

        hashData.put(index,firstName);


        return hashData;


    }

    public static Hashtable<Integer,String> hashTableX() {

        // Hashtable is synchronized , legacy class,doesn’t guarantee any kind of order.
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(105," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        ht.put(104,"Rahulxx");

        return ht;
    }


    public static void main(String[] args)
    {

        char[] list ={'q','1','a','4','4','7','a','5'};

        Set<Character> set = new HashSet<>();

        List<Character> cList = new ArrayList<Character>();

        for (char ch : list)
            cList.add(ch);
        Collections.sort(cList);

        //   System.out.println("max " +Collections.max(cList));


        System.out.println(sortList(list));

        //----------hashtable -------------------------
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        ht.put(104,"Rahulxx");

        ht=hashTableTest(ht,105,"Mike Test");

        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

/// test
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:HashExercise.hashTableX().entrySet()) {
            System.out.println(" test.... "+m.getKey()+" "+m.getValue());
        }


        //----------------hashmap--------------------------------

        //   is non-synchronized. This means if it’s used in multithread environment
        //   then more than one thread can access and process the HashMap simultaneously.
        //   allows duplicate    Hashtable does notS
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("100","Amit");
        hm.put("104","Amit");  // hash map allows duplicate values
        hm.put("101","Vijay");
        hm.put("102","Rahul");
        System.out.println("-----------Hash map-----------");

        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    //   System.out.println(hm.getKey(1)+" "+hm.getValue(1));

        int k =0;
        for ( int i =0; i < list.length;i++)
            if ( set.add(list[i])) {
                k=Collections.frequency(cList, list[i]);
                //  System.out.println(" k = "+k+" "+list[i]);

                if (Collections.frequency(cList, list[i]) > 1)
                    System.out.println(list[i] +"  duplication ");

              //  System.out.println(Collections.frequency(cList, list[i]));

            }







    }
}
