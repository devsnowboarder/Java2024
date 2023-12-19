import utility.mathFunction;


public class fibonacci {

 static void fiboNumber(int count) {

      int num1;
      int num2;
      num1 = 0;
      num2 = 1;

     for (int i = 1; i <= count; ++i)
     {
         System.out.print(num1+" ");
         /* On each iteration, we are assigning second number
          * to the first number and assigning the sum of last two
          * numbers to the second number
          */
         int fibo = num1 + num2;
         num1 = num2;
         num2 = fibo;
     }

     System.out.println(" fibo number first try ");
     System.out.println("\n");


 }

    public static void main(String[] args) {

        mathFunction mathSolution = new mathFunction();

        int count = 10, num1 = 0, num2 = 1;
        //baseState.printTest();

        System.out.print("Fibonacci Series of "+count+" numbers:");
        System.out.println("\n");

        fiboNumber(count);


        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }

        System.out.println("\n");

        mathFunction.fiboNum(20);
    }


}
