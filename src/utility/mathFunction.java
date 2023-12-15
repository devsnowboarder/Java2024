package utility;

public class mathFunction {


    public static String  primeNumber(Integer n) {

        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        String primeNumberList;

        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println(primeNumbers);
        primeNumberList = primeNumbers;
        return primeNumberList;

    }


     public static void fiboNum(int count) {
         int num1 = 0, num2 = 1;


         System.out.print("Fibonacci Series of " + count + " numbers:");

         for (int i = 1; i <= count; ++i) {
             System.out.print(num1 + " ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
             int fibo = num1 + num2;
             num1 = num2;
             num2 = fibo;
         }
     }

}
