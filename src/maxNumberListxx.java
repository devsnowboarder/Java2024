

import java.util.*;

public class maxNumberListxx {

    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};

        char arrChar[]= {'a','b','d','g'};

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(2);
        numberList.add(20);
        numberList.add(21);
        numberList.add(225);
        numberList.add(222);

        // Java Stream and max to find the max element
        // in array
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int diff;

        // Printing the result
        System.out.println("Largest in given array is " +max);
        System.out.println("smallest in given array is " +min);

        diff = max - min;

        System.out.println("Different betwee Max and min" +diff);



        List<Integer> list = new ArrayList<>();
        // Adding elements in List
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }


        System.out.println( " Max from collection " +Collections.max(list));
        System.out.println( " Min from collection " +Collections.min(list));

    }
}
