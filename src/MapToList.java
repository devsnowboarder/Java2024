import java.util.*;


public class MapToList {

    public static void main(String[] arg) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        String[] names ={"mike","james","george","sandy","jenny","mike","james"};

        int[]  numbers = {1,3,6,2,0,8,3,5,9,2,65,32};

        for(int i=0; i < names.length;i++) {
            hmap.put(i,names[i]);
        }

        // how to make the first char on the string to upper case

        Collection<String>  values = hmap.values();

        ArrayList<String> listOfValues = new ArrayList<>(hmap.values());

        System.out.println("xxxxxxxxxxxx" +listOfValues);



        List <Integer> numlistx = new ArrayList<>();

        Set<Integer> keySet = hmap.keySet();

        for (int k: keySet)
            System.out.println(k);

        for( int num : numbers)
            numlistx.add(num);


        for ( String value: listOfValues)
            System.out.println(" name " +value);

        Collections.reverse(listOfValues);
        System.out.println(listOfValues);

        Collections.reverse(numlistx);
        System.out.println(numlistx);

        Collections.sort(numlistx);
        System.out.println(numlistx);

        System.out.println(Collections.max(numlistx));
        System.out.println(Collections.min(numlistx));

        int diff = Collections.max(numlistx) - Collections.min(numlistx);

        System.out.println(diff);



    }
}

