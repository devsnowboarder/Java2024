import java.util.ArrayList;
import java.util.List;


public class ListReverseWords {


    public static String reverseWord(String str) {


        String [] wordList = str.split(" ");

        String strRev =" ";

        for(String x: wordList) {
            System.out.println(x);
            StringBuilder test = new StringBuilder(x);
            strRev = test.reverse().toString()+" " + strRev;

        }
        return strRev;
    };

    public static void main(String[] args) {

        String city ="San Francisco California";

        System.out.println(ListReverseWords.reverseWord(city));


    }
}
