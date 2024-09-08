public class FindtheMaxConsecutiveOnes {
    public static void main(String[] args) {

        String str = "1101111000000110";


        char[] charLIstx = str.toCharArray();

         int max=0;
         int ones=0;
         int num=0;
         int count=0;
        for ( char x: charLIstx) {

            if (x == '1')
                count = count + 1;
            else {
                  ones= count;
                if (ones > max)
                    max = ones;
                count = 0;
            }

        }
        System.out.println(" max = "+max);
    }






}
