import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Java program to find first non-repeating
// element.
class NonRepeat {

    static int firstNonRepeating(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                System.out.println(arr[i] + "   " + arr[j]);
                if (i != j && arr[i] == arr[j])

                    break;
            }
            if (j == n)
                return arr[i];
        }

        System.out.println(" test");
        return -1;
    }

    static int firstNonRepeatColl(int arr[], int n) {

        List<String> arrList = new ArrayList<>();


        for (int i =0; i < arr.length;i++)
            arrList.add(" " + arr[i]);


        for (  String x : arrList)
            if (Collections.frequency(arrList,x) < 2)
                  System.out.println(x);
            else
                   return Integer.parseInt(x);


        return -1;
    }

    //Driver code
    public static void main (String[] args)
    {

        int arr[] = { 7, 3, 9, 2, 7, 4 };
        int n =  arr.length;

      //  System.out.print(firstNonRepeating(arr, n));
        System.out.print(firstNonRepeatColl(arr, n));



    }
}
 