package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class charList {

    public static  HashSet<String>  strList(char[] charList) {

        List<String> listChar = new ArrayList<String>();

        for ( Character xCh : charList)
            listChar.add(" "+xCh);

        HashSet<String>  strList = new HashSet<>(listChar);


        for (String x: strList)
        {
            if (Collections.frequency(listChar,x) >1)
                System.out.println(x);
        }

       return  strList;


    }
}