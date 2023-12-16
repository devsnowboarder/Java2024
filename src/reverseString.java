import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class reverseString {

    public static void main(String[] args){

        String city = "San Francisco California";

        String [] state ={"CA","OR","Ny"};

        String [] cityList = city.split(" ");

        List<String> cityList2 = new ArrayList<>();


        List<String> sList = Arrays.asList(state);
        // convert and array to a list,
        // then I can use the collection stuff



        StringBuilder test = new StringBuilder(city).reverse();


        System.out.print("Reverse =  " +test.toString());


        String[] newList = city.split(" ");

        for(String word: newList)

            System.out.println("\n"+word);


        for (String stateList : sList)
            System.out.println(stateList);

        StringBuilder RString = new StringBuilder();

        for ( String cityX : cityList) {
            cityList2.add(cityX);

            StringBuilder cityR = new StringBuilder(cityX);

            cityR = cityR.reverse();

            RString = RString.append(cityR.toString()+ " ");

        }

        System.out.println(RString);


        String sTest = "this is a test from San Francisco";

        List<String> wordList = new ArrayList<>();

        String str = "This program splits a string based on space";




        String[] tokens = str.split(" ");


        String testStr2=" ";

        String testStr="";

        for(String item : tokens )
        {
            // System.out.println(item);

            StringBuilder reverString = new StringBuilder(item);

            //System.out.print(reverString.reverse().toString()+ " ");

            testStr = reverString.reverse().toString()+ " ";

            testStr2 = testStr2+testStr +" ";

        }


        System.out.print(testStr2);




        //   List<Integer> nList = Arrays.asList(stateList);

        //  System.out.println(Collections.max(nList));
        // System.out.println(Collections.min(nList));


        // System.out.println(nList);

    }
}
