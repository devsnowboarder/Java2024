import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FrequencymanyIJK {

    static void stringSeq(String strseq)
    {
        char[]  charseq = strseq.toCharArray();
        ArrayList<String> listChar = new ArrayList<>();

        for ( char x: charseq) {
            listChar.add(" " + x);
        }
        HashSet<String>  set =new HashSet<String>(listChar);

        for ( String x2: set)
              System.out.print(x2 +""+Collections.frequency(listChar, x2)+ " ");
    }
    public static void main(String[] args) {

        String sequence="AAABBBCCDDY";
        char[] seq = sequence.toCharArray();
        char x;
        int count =0;
        String test;
        x = seq[0];

        String results=" ";

        for ( int i=0; i < sequence.length();i++)
        {
            if ( x==seq[i]) {
                count++;
            }
            else
            {
              //  System.out.println( count + " "+x);
                test = " "+count+x;
                results = results+test;
                count=1;
                x = seq[i];
            }
        }
     //   System.out.println( count + ""+x);
        test = " "+count+x;
        results = results + test;

        System.out.println(results);


        stringSeq(sequence);
    }


}
