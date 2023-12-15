import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MissingNum {

    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;

        //   System.out.println(n);
        int sum=n*(n+1)/2;

        // System.out.println(sum);

        int restSum=0;

        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }

    public static void  main(String arg[]) {

        int[] arr = {1, 2, 3, 4, 6 ,3,4,7,9,10,10};



        System.out.println(missingNumber(arr));


        int sum = arr.length+1;
        int total = sum* ( sum+1 )/2;
        int totalSun=0;

        for ( int i=0; i < arr.length; i++)
        {
            totalSun += arr[i];
        }

        int missing;

        missing = total-totalSun;
        System.out.println("missing " +missing);


        ArrayList<String> missNum = new ArrayList<>();

        for ( int x: arr)
            missNum.add (" "+x);


        Collections.sort(missNum);

        HashSet<String> missNumSet = new HashSet<>(missNum);
        System.out.println(missNumSet);

        ArrayList<String> numList2 = new ArrayList<>(missNumSet);
        System.out.println(numList2);
        
        int j=1;
        for(String x: numList2) {
            System.out.println(x.trim()+" "+j);

            if (j != Integer.parseInt(x.trim()))
            {
               System.out.println(j+"missing" +x );
            
           }

            j++;
        }













    }

}
