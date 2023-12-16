public class tryandcatch2 {

     public static void trycatch2()
     {
         try{
             int a[]=new int[5];
             a[5]=30/0;
         }
         catch(ArithmeticException e)
         {
             System.out.println("Arithmetic Exception occurs");
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             System.out.println("ArrayIndexOutOfBounds Exception occurs");
         }
         catch(Exception e)
         {
             System.out.println("Parent Exception occurs");
         }
         System.out.println("rest of the code");
     }

    public static void trycatch3()
    {
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
        public static void main(String[] args) {

            try{
                int a[]=new int[5];
                a[5]=30/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception occurs");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
            }
            catch(Exception e)
            {
                System.out.println("Parent Exception occurs");
            }
            System.out.println("rest of the code");




            trycatch2();
            trycatch3();


        }

}
