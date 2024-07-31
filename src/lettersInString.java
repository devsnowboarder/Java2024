import java.util.*;

public class lettersInString {
    
    static ArrayList<Character>  letterList ( String str) {

        ArrayList<Character> letter = new ArrayList<>();

        for ( int i =0; i < str.length(); i++ )
              if (Character.isLetter(str.charAt(i)))
                  letter.add(str.charAt(i));


        return letter;
    };


    public static void main(String[] args) {
        String str = "123L4AB3405";

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                counter++;

            // if ( Character.isUpperCase(str.charAt(i)))
            //if (Character.isLowerCase((str.charAt(i))))
        }
        System.out.println(counter + " letters.");

        System.out.println(" Letter only    "+lettersInString.letterList(str));


        String teststr = "Hello World";
        int len = teststr.length();
        Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));


        System.out.println("Minal  "+Math.min(len, 26));

        for (int i = 0; i < len; ++i) {
            char charAt = teststr.charAt(i);

            System.out.println(numChars);


            if (!numChars.containsKey(charAt)) {
                numChars.put(charAt, 1);
            } else {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        String strTest = "Hello World";

        char[] strX = strTest.toCharArray();

        List<Character> clist = new ArrayList<>();

        Set<Character> nonDup = new HashSet<>();

        for (Character item : strX)
            clist.add(item);


        for (Character k : clist)
            if (nonDup.add(k))
                System.out.println(k + "   " + Collections.frequency(clist, k));



        // Very Bad Coding

        String mikeString = "Powell";
        char [] mString = mikeString.toCharArray();

        int count = 0;

        for (int i = 0; i < mikeString.length(); i++) {

            for (int j = 0; j < mikeString.length(); j++) {
                if (mString[i] == mString[j])
                    count++;
            }
            System.out.println(mString[i] + " " + count);
            count = 0;


        }
    }
}
