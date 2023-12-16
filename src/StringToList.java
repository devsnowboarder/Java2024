import java.util.ArrayList;
import java.util.List;


public class StringToList {

    public static void main(String arg[])
    {
        String sTest = "this is a test from San Francisco";

        List<String> wordList = new ArrayList<>();

        String str = "This program splits a string based on space";
        String[] tokens = str.split(" ");
        for(String item : tokens )
        {
            System.out.println(item);

            StringBuffer reverString = new StringBuffer(item);
            System.out.println(reverString.reverse().toString());

        }



    }
}
