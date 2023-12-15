import java.util.*;

public class frequency3 {

    public static List<Integer> sortedList (Integer [] num) {

        Integer[] numX = {1, 6, 3, 10, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8};
        List<Integer> targetList = Arrays.asList(num);
        List<Integer> numx = new ArrayList<Integer>();
        Collections.sort(targetList);

        return targetList;

    }

    public static Integer frequency(List<Integer> number,Integer i) {

        return Collections.frequency(number,i);



    }


    public static void main(String[] args) {

        Integer[] num = {1, 6, 3, 10, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8};


        Character[] charList = {'1', '6', '3','d','5', '6', '6', '6', '6', '6', '7', '8', '8', '8'};

        // make it a array list
        // use set  set <Character> test = new HashSet<String>(

        List<Integer> targetLIST = Arrays.asList(num);

        List<Character>targetChar =Arrays.asList(charList);



        for ( int i : targetLIST)
            System.out.println(i);



        Set <Integer> number = new HashSet<>(targetLIST);

        for( int i: number ) {
            // if (number.add(i))
            System.out.println(i +"  nu m =  "+frequency3.frequency(targetLIST, i));
        }

        System.out.println(Collections.max(targetLIST));
        System.out.println(Collections.min(targetLIST));

         int xnum = Collections.max(targetLIST).intValue();
         int xnum2 = Collections.min(targetLIST).intValue();

         System.out.println(" Max and Min");
         System.out.println(xnum - xnum2);


        Set<Character> charList2 = new HashSet<>(targetChar);
        for (Character x: charList2)
            System.out.println(x +"    "+Collections.frequency(targetChar, x));






    }
}
