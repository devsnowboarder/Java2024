public class paladrome3 {

    public static void checkPalindrome(String s)
    {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        // check whether the string is palindrome or not
        if (s.equals(reverse))
            System.out.println("Yes");

        else
            System.out.println("No");
    }

    public static void main (String[] args)
            throws Exception
    {
        checkPalindrome("malayalam");

    }



}
