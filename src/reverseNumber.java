import utility.reverseObject;


public class reverseNumber
{

    public static Integer reverseNumbeSub(String s) {


        int n;
        int a = 0;
        int x;


        System.out.println("Enter any number:");
        n = Integer.parseInt(s);

        while(n > 0)
        {
            x = n % 10;
            // System.out.println("x== "+x);
            a = a * 10 + x;
            // System.out.println("a = " +a);
            n = n / 10;
            System.out.println(" n  ="+n);
        }

        return a;

    };


      public static String  reversNumber2(int number) {
          // need to instancia a memory localation for setting up a
          StringBuilder revStr = new StringBuilder(" "+number);
          return revStr.reverse().toString();

    };

    public static void main(String args[])
    {

        reverseObject reverse = new reverseObject();

       System.out.println( reverseNumber.reverseNumbeSub("1234"));

      // System.out.println( reverseNumber.reversNumber2(1234).trim());
      //  System.out.println(reverse.reverseItem("5678"));

    }




}


