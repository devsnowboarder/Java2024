import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicatewithSet {

    public static  List<String> listTest(String test) {

        List<String>  input = Arrays.asList(test);
        List<String> input2 = new ArrayList<>();

        for(String x: input)
            input2.add(x);
        return input2;
    }

    public static void main(String[] args) {

        String test ="Lake Tahoe San Francisco";
        String[] testRev= test.split(" ");

        StringBuilder revTest= new StringBuilder();

        for (String revTestxx : testRev) {

            StringBuilder revTest2 =  new StringBuilder(revTestxx);

            revTest2 = revTest2.reverse();

            revTest =revTest.append(revTest2.toString()+ " ");
        }

        System.out.println(revTest.toString());

    }



}





