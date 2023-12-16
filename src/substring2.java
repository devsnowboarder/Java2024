public class substring2 {

    public static void main(String args[])
    {

        String day = "Saturday";

        for( int i =0; i < day.length()+1; i++)
        {


            System.out.println(day.substring(0,i));


        }


        for( int i =0; i < day.length()+1; i++)
        {

          System.out.println(day.substring(i,day.length()));

        }



    }
}
