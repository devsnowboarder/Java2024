public class tryandcatch {


    public static void trycatch2()
    {
        int a = 10, b = 5, c = 5, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
            }
            catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
             }

            finally {
            System.out.println("I am in final block");
            }
    }
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }


        trycatch2();
    }
}