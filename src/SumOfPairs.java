import java.util.*;

class SumOfPairs {


    public static void main(String[] args) {

        int n = 9 ;

        int numbers[] = {1,3,4,6,7};


        Set set = new HashSet<>();


        for (int value : numbers) {

            int target = n- value;

            System.out.println("target ="+ target+"   value = "+ value);
            if (!set.contains(target)) {
                set.add(value);
                System.out.println(set);
            }

            else
                System.out.printf("result"+"(%d, %d) %n", value, target);

        }


        List<Integer> numList =new ArrayList<Integer>();

        for ( Integer j: numbers)
            numList .add(j);

        System.out.println(Collections.max(numList)- Collections.min(numList));

         Integer xx= Collections.max(numList);
         System.out.println(xx);

    }







}