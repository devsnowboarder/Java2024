import utility.character;

import java.util.ArrayList;

public class firstLetterString {


    // Function to find string which has first
    // character of each word.
    static String firstLetterWord(String str)
    {
        String result = "";

        // Traverse the string.
        boolean v = true;

        for (int i = 0; i < str.length(); i++)
        {

            System.out.println(str.charAt(i));

            // If it is space, set v as true.
            if (str.charAt(i) == ' ')
            {
                v = true;
            }

            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false.
            else if (str.charAt(i) != ' ' && v == true)
            {
                result += (str.charAt(i));
                v = false;
            }
        }

        return result;
    }



    static void firstLetter2(String str)
    {
        ArrayList listStr = new ArrayList<>();

        String[] strs = str.split(" ");

        for ( String x: strs) {
            listStr.add(x);
        }


        String temp;

        for ( int i =0; i < listStr.size();i++) {
            temp= (String) listStr.get(i);

            System.out.print(temp.substring(0,1));

        }

    }
    // Driver code
    public static void main(String[] args)
    {
        character firstChar = new character();

        String str = "geeks for geeks";
        System.out.println(firstLetterWord(str));
        firstLetter2("Hello World This is a test");
        character.firstLetterChar("Hello World This is a test");

    }

}

