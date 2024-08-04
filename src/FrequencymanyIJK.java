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
        char[] seqCharArray = sequence.toCharArray();

        char x;
        int count =0;
        String test;
        x = seqCharArray[0];

        String results=" ";

        for ( int i=0; i < sequence.length();i++)
        {
            if ( x==seqCharArray[i]) {
                count++;
            }
            else
            {
                test = " "+count+x;
                results = results+test;
                count=1;
                x = seqCharArray[i];
            }
        }
     //   System.out.println( count + ""+x);
        test = " "+count+x;
        results = results + test;

        System.out.println(results);
        stringSeq(sequence);

        //Method # 2 using collection..
        // convert the String to Char array
        // add the Char array to ArrayList<Character>

        ArrayList<Character> charList = new ArrayList<Character>();
        for ( char xx : seqCharArray)   // is the char array
              charList.add(xx);

         HashSet<Character> charList2 = new HashSet<>(charList);

         System.out.println(" Charlist " + charList2);

        for (char xx : charList2)       //frequency(xx,charList)
           System.out.println("  number  " + xx +"   "+Collections.frequency(charList, xx));


    }


}
