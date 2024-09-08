import utility.charList;

import java.util.*;

public class duplicateitem2 {
    public static void main(String[] args) throws Exception {

        charList charList2 = new charList();

        char[]  charList = {'a','b','g','t','a','b'};

        List<String> list = new ArrayList<String>();
        List<Character> listChar = new ArrayList<Character>();

        for ( Character xCh : charList)
            listChar.add(xCh);

        //  remove the duplicate in the list
        HashSet<Character>  strList = new HashSet<>(listChar);
        System.out.println(" remove list of duplicate Characters hashSet" +listChar);

        // go through the list once but gets the count
        for (Character x: strList)
        {
            if (Collections.frequency(listChar,x) >1)   // printing all the duplicate
                System.out.println(" duplicate "+x);
        }

        list.add("Ashok");
        list.add("Vinod");
        list.add("Kumar");
        list.add("Ashok");
        list.add("Mariyala");
        list.add("Venkata");
        list.add("Mariyala");
        list.add("Vinod");
        list.add("Ashok");
        list.add("Kumar");

        Map<String, Integer> duplicates = new HashMap<String, Integer>();

        for (String str : list) {
            if (duplicates.containsKey(str)) {
                duplicates.put(str, duplicates.get(str) + 1);
            } else {
                duplicates.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        HashSet<String> set =new HashSet<String>(list);

        for ( String x: list)
            System.out.println(x + "   "+Collections.frequency(list,x));
        HashSet setString = new HashSet<>(listChar);

        System.out.println(setString);

        for ( Object str: setString)
            System.out.println(str + "  x "+Collections.frequency(listChar,str));

        System.out.println(utility.charList.strList(charList));

    }



}