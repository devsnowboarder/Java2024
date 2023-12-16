import static java.lang.Math.abs;

public class twodimensionArray {

    static public void main(String []arg) {



        String[][] badgeTimes = new String[][]{
                {"Paul", "1355"},
                {"Jennifier", "1910"},
                {"John", "830"},
                {"John", "845"},
                {"John", "915"},
                {"John", "930"},
                {"James", "1640"},
                {"James", "1650"}

        };

        //  ArrayList <Integer> numTime = new ArrayList<>();

        int time =0;
        int time2=0;



        int j;
        for (int i = 0; i < badgeTimes.length; i++) {

            if(! badgeTimes[i][0].equals(" ")) {
                //  System.out.println(badgeTimes[i][0] + "        " + badgeTimes[i][1]);


                for (j = i + 1; j < badgeTimes.length; j++) {
                    // System.out.println(j + "        " + badgeTimes[j][0]+"        " + badgeTimes[j][1]);
                    time = Integer.parseInt(badgeTimes[j - 1][1]);
                    if (badgeTimes[i][0].equals(badgeTimes[j][0])) {
                        // System.out.println(j + "        " + badgeTimes[j][0] + "        " + badgeTimes[j][1]);
                        time2 = Integer.parseInt(badgeTimes[j][1]);
                        //  System.out.println("         " + timex + "    " + time2);
                        int totalTime = abs(time - time2);
                        // System.out.println("          total  " + totalTime);
                        time = Integer.parseInt(badgeTimes[j][1]);
                        if (totalTime < 60)
                            System.out.print( badgeTimes[j][0]+"    "+badgeTimes[j-1][1]+"  "+badgeTimes[j][1]);
                        badgeTimes[j][0] = " ";
                        System.out.println("  ");

                    } //else
                    //System.out.println("  ");
                    // break;


                }

            }

        }

    }

}
