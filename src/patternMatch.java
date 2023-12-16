public class patternMatch {




    public static void main(String args[]) {

        String str1 = "OldSite:GeeksforGeeks.org";
        String pStr = "NewSite:GeeksQuiz.com";

        String match;

        int pattern = pStr.length();


        for (int i = 0; i < str1.length() - pattern; i++) {
            System.out.println(pStr + "   " + str1.substring(i, pattern + i));

            if (pStr.equals(str1.substring(i, pattern + i))) {
                System.out.println(" Found" + pStr);
                System.out.println(pStr.length());
            }

        }

        String X1 = "GXTXAYB";
        String Y1 = "AGGTAB";

        int m = X1.length();
        int n = Y1.length();

        int count = 0;
        int result = 0;


        char[] X = X1.toCharArray();
        char[] Y = Y1.toCharArray();


        int LCStuff[][] = new int[m][n];

        System.out.println(m+" "+n);


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (X[i] == Y[j]) {
                    LCStuff[i][j] = 1;

                }
                else
                    LCStuff[i][j] = 0;
            }

            System.out.println("\n");
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(LCStuff[i][j]);
            System.out.println("\n");
        }

        int k =0;
        int x =0;

        for ( int l=0; l < m; l++) {
            k=x;
            for (int i = 0; i < n; i++) {
                //  System.out.print(LCStuff[i][k]);
                System.out.println(i+" "+k);
                k++;
            }
            x++;
            System.out.println("\n");

        }






    }
}
