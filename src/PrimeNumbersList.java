import utility.mathFunction;



class PrimeNumbersList
{

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
    public static void main (String[] args)
    {
         mathFunction  mathSolution = new mathFunction();

        System.out.println("Prime numbers from 1 to 100 are :");
        PrimeNumbersList.primeNumber(100);

        mathSolution.primeNumber(100);

    }
}


