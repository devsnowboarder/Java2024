public class MaxCharString {

    static final int ASCII_SIZE = 256;

    static char getMaxOccuringChar(String str) {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];


        // Construct character count ar
        //ray from the input
        // string.
        int len = str.length();

        char[] str2 = str.toCharArray();

        for (int i = 0; i < str2.length; i ++)
            if ( Character.isLetter(str2[i]))
               System.out.println(str2[i]);
            else
                System.out.println(str2[i] +"  Not a Character");

        /*
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
            System.out.println(count[i]);
        }
        */


        System.out.println("xxxx"+count[str.charAt(2)]);
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    // Driver Method
    public static void main(String[] args) {
        String str = "samples12";


        System.out.println("Max occurring character is " +
                getMaxOccuringChar(str));


    }
}

