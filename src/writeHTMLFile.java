import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

//Users/Michael/IntelliJExercise/Project/src/main/java/writeHTMLFile.java

public class writeHTMLFile {



    public static void main(String[] args) {


        String title ="Test Project";

        ArrayList<String> picture = new ArrayList<String>();


        picture.add("england0227.jpg");
        picture.add("england0228.jpg");
        picture.add("england0229.jpg");
        picture.add("england0230P.jpg");
        picture.add("england0231.jpg");
        picture.add("england0232.jpg");
        picture.add("england0233P.jpg");
        picture.add("england0234P.jpg");
        picture.add("england0235.jpg");
        picture.add("england0236.jpg");
        picture.add("england0237.jpg");
        picture.add("england0238.jpg");
        picture.add("england0239.jpg");
        picture.add("england0240P.jpg");
        picture.add("england0241P.jpg");
        picture.add("england0242.jpg");
        picture.add("england0243P.jpg");
        picture.add("england0244.jpg");
        picture.add("england0245P.jpg");
        picture.add("england0246.jpg");
        picture.add("england0247.jpg");
        picture.add("england0248.jpg");
        picture.add("england0249.jpg");
        picture.add("england0250.jpg");
        picture.add("england0251.jpg");
        picture.add("england0252.jpg");
        picture.add("england0253.jpg");
        picture.add("england0254.jpg");
        picture.add("england0255.jpg");
        picture.add("england0256.jpg");
        picture.add("england0257.jpg");
        picture.add("england0258.jpg");
        picture.add("england0259.jpg");
        picture.add("england0260P.jpg");
        picture.add("england0261.jpg");
        picture.add("england0262P.jpg");
        picture.add("england0263P.jpg");
        picture.add("england0264P.jpg");
        picture.add("england0265P.jpg");
        picture.add("england0266.jpg");
        picture.add("england0267.jpg");
        picture.add("england0268.jpg");
        picture.add("england0269.jpg");
        picture.add("england0270.jpg");
        picture.add("england0271.jpg");
        picture.add("england0272.jpg");
        picture.add("england0273P.jpg");
        picture.add("england0275.jpg");
        picture.add("england0276.jpg");
        picture.add("england0277.jpg");
        picture.add("england0278.jpg");
        picture.add("england0279.jpg");
        picture.add("england0280P.jpg");
        picture.add("england0281.jpg");
        picture.add("england0282.jpg");
        picture.add("england0283.jpg");
        picture.add("england0284.jpg");
        picture.add("england0285.jpg");
        picture.add("england0286.jpg");
        picture.add("england0287.jpg");
        picture.add("england0288.jpg");
        picture.add("england0289.jpg");
        picture.add("england0290.jpg");
        picture.add("england0291.jpg");
        picture.add("england0292.jpg");
        picture.add("england0293.jpg");
        picture.add("england0294.jpg");
        picture.add("england0295.jpg");
        picture.add("england0296.jpg");
        picture.add("england0297.jpg");
        picture.add("england0298.jpg");
        picture.add("england0299.jpg");
        picture.add("england0300.jpg");
        picture.add("england0301.jpg");
        picture.add("england0302P.jpg");
        picture.add("england0303.jpg");
        picture.add("england0304.jpg");
        picture.add("england0306.jpg");
        picture.add("england0307.jpg");
        picture.add("england0308.jpg");
        picture.add("england0309.jpg");
        picture.add("england0310.jpg");
        picture.add("england0311.jpg");
        picture.add("england0312.jpg");
        picture.add("england0313.jpg");
        picture.add("england0314.jpg");
        picture.add("england0315.jpg");
        picture.add("england0316.jpg");
        picture.add("england0317P.jpg");
        picture.add("england0318P.jpg");
        picture.add("england0319P.jpg");
        picture.add("england0320P.jpg");
        picture.add("england0321.jpg");
        picture.add("england0322.jpg");
        picture.add("england0323.jpg");
        picture.add("england0324P.jpg");
        picture.add("england0325.jpg");
        picture.add("england0326.jpg");
        picture.add("england0327.jpg");
        picture.add("england0328.jpg");
        picture.add("england0329.jpg");
        picture.add("england0330.jpg");
        picture.add("england0332.jpg");
        picture.add("england0334.jpg");
        picture.add("england0335.jpg");
        picture.add("england0336.jpg");
        picture.add("england0337.jpg");
        picture.add("england0338.jpg");
        picture.add("england0339.jpg");
        picture.add("england0340.jpg");
        picture.add("england0341.jpg");
        picture.add("england0342P.jpg");
        picture.add("england0343P.jpg");
        picture.add("england0344.jpg");
        picture.add("england0345P.jpg");
        picture.add("england0346P.jpg");
        picture.add("england0347P.jpg");
        picture.add("england0348P.jpg");
        picture.add("england0349.jpg");
        picture.add("england0350.jpg");
        picture.add("england0351P.jpg");
        picture.add("england0352.jpg");
        picture.add("england0353.jpg");
        picture.add("england0354.jpg");
        picture.add("england20180904_0018.jpg");
        picture.add("england20180904_0019P.jpg");
        picture.add("england20180904_0020P.jpg");
        picture.add("england20180904_0021P.jpg");
        picture.add("england20180904_0022P.jpg");
        picture.add("england20180904_0023P.jpg");
        picture.add("england20180904_0024P.jpg");
        picture.add("england20180904_0025P.jpg");


        Iterator<String> itr = picture.iterator();

        // Generat the HTML boody here
        try {
          //  File file = new File("/Users/Michael/IntelliJExercise/Project/src/main/java/photo.html");



            File file = new  File("/Volumes/mike_album/England/englandX.html");

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("<!DOCTYPE html> ");
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>" +title+ "</title>" );
            printWriter.println("<link rel=@stylesheet@  href=@../photocss/responsephoto.css@/>");
            printWriter.println("<link rel=@stylesheet@  href=@css/photo2.css@/>");
            printWriter.println("<script src=@../scripts/like.js@></script>");
            printWriter.println("<script src=@../googleAnalytics/googleAnalytics.js@></script>");

            printWriter.println("<script async src=@https://www.googletagmanager.com/gtag/js?id=UA-117913383-1@></script>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println(" ");
            printWriter.println(" ");

            printWriter.println("<h1 align=@center@>"+title+"</h1>");

            String pics;


            while ( itr.hasNext() ) {
                pics = itr.next();

                printWriter.println(" <div class=@pictureFrame@>");

                if ( pics.contains("P"))
                    printWriter.println("       <p align =@center@><img src=@images/"+pics+"@  class =@rounded@   width=@300@ height=@400@ ></p>");
                else
                    printWriter.println("       <p align =@center@><img src=@images/"+pics+"@  class =@rounded@   width=@400@ height=@300@ ></p>");


               // printWriter.println("       <div align=@center@><br><p align=@center@><div  class=@rw-ui-container@></div></p></div>");
                  printWriter.println("      </div>");
                printWriter.println("  </div>");
                printWriter.println(" ");
                printWriter.println(" ");
               // printWriter.println("<br><br>");

            }

            printWriter.println(" ");
            printWriter.println(" ");

            printWriter.println("  </body>");
            printWriter.println("</html>");



            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }



    }





}
