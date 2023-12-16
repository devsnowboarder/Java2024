public class StringtoChar {

    public static void main( String args[]) {

        String city ="San Francisco State Gators";

        char [] cityChar = city.toCharArray();

        String[] cityList;

        for ( int i =cityChar.length-1; i > 0; i-- )
            System.out.print(cityChar[i]);


        //List<String> cityList = new ArrayList<String>(city);

        cityList = city.split(" ");


        System.out.println("\n");
        for ( String cList : cityList) {
            //  System.out.println(cList);

            StringBuilder rStr2 = new StringBuilder(cList);

            rStr2 = rStr2.reverse();
            System.out.print(rStr2.toString() + " ");

        }


    }

}

