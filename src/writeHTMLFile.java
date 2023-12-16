import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

//Users/Michael/IntelliJExercise/Project/src/main/java/writeHTMLFile.java

public class writeHTMLFile {



    public static void main(String[] args) {


        String title ="Eric Project";

        ArrayList<String> picture = new ArrayList<String>();
        picture.add("Eric06514.jpg");
        picture.add("Eric06500.jpg");
        picture.add("Eric06474.jpg");
        picture.add("Eric06475.jpg");
        picture.add("Eric06529.jpg");
        picture.add("Eric06501.jpg");
        picture.add("Eric06515.jpg");
        picture.add("Eric06503.jpg");
        picture.add("Eric06517.jpg");
        picture.add("Eric06477.jpg");
        picture.add("Eric06488.jpg");
        picture.add("Eric06489.jpg");
        picture.add("Eric06476.jpg");
        picture.add("Eric06516.jpg");
        picture.add("Eric06502.jpg");
        picture.add("Eric06506.jpg");
        picture.add("Eric06512.jpg");
        picture.add("Eric06472.jpg");
        picture.add("Eric06466.jpg");
        picture.add("Eric06499.jpg");
        picture.add("Eric06498.jpg");
        picture.add("Eric06467.jpg");
        picture.add("Eric06473.jpg");
        picture.add("Eric06513.jpg");
        picture.add("Eric06507.jpg");
        picture.add("Eric06539.jpg");
        picture.add("Eric06511.jpg");
        picture.add("Eric06505.jpg");
        picture.add("Eric06465.jpg");
        picture.add("Eric06471.jpg");
        picture.add("Eric06470.jpg");
        picture.add("Eric06464.jpg");
        picture.add("Eric06504.jpg");
        picture.add("Eric06510.jpg");
        picture.add("Eric06538.jpg");
        picture.add("Eric06563.jpg");
        picture.add("Eric06562.jpg");
        picture.add("Eric06560.jpg");
        picture.add("Eric06548.jpg");
        picture.add("Eric06549.jpg");
        picture.add("Eric06561.jpg");
        picture.add("Eric06559.jpg");
        picture.add("Eric06565.jpg");
        picture.add("Eric06571.jpg");
        picture.add("Eric06570.jpg");
        picture.add("Eric06564.jpg");
        picture.add("Eric06558.jpg");
        picture.add("Eric06566.jpg");
        picture.add("Eric06567.jpg");
        picture.add("Eric06556.jpg");
        picture.add("Eric06542.jpg");
        picture.add("Eric06543.jpg");
        picture.add("Eric06557.jpg");
        picture.add("Eric06541.jpg");
        picture.add("Eric06555.jpg");
        picture.add("Eric06569.jpg");
        picture.add("Eric06568.jpg");
        picture.add("Eric06554.jpg");
        picture.add("Eric06540.jpg");
        picture.add("Eric06544.jpg");
        picture.add("Eric06550.jpg");
        picture.add("Eric06551.jpg");
        picture.add("Eric06545.jpg");
        picture.add("Eric06553.jpg");
        picture.add("Eric06547.jpg");
        picture.add("Eric06546.jpg");
        picture.add("Eric06552.jpg");
        picture.add("Eric06535.jpg");
        picture.add("Eric06521.jpg");
        picture.add("Eric06509.jpg");
        picture.add("Eric06469.jpg");
        picture.add("Eric06482.jpg");
        picture.add("Eric06496.jpg");
        picture.add("Eric06497.jpg");
        picture.add("Eric06483.jpg");
        picture.add("Eric06468.jpg");
        picture.add("Eric06508.jpg");
        picture.add("Eric06520.jpg");
        picture.add("Eric06534.jpg");
        picture.add("Eric06522.jpg");
        picture.add("Eric06536.jpg");
        picture.add("Eric06495.jpg");
        picture.add("Eric06481.jpg");
        picture.add("Eric06480.jpg");
        picture.add("Eric06494.jpg");
        picture.add("Eric06537.jpg");
        picture.add("Eric06523.jpg");
        picture.add("Eric06527.jpg");
        picture.add("Eric06533.jpg");
        picture.add("Eric06490.jpg");
        picture.add("Eric06484.jpg");
        picture.add("Eric06485.jpg");
        picture.add("Eric06491.jpg");
        picture.add("Eric06532.jpg");
        picture.add("Eric06526.jpg");
        picture.add("Eric06530.jpg");
        picture.add("Eric06524.jpg");
        picture.add("Eric06478.jpg");
        picture.add("Eric06487.jpg");
        picture.add("Eric06493.jpg");
        picture.add("Eric06492.jpg");
        picture.add("Eric06486.jpg");
        picture.add("Eric06479.jpg");
        picture.add("Eric06525.jpg");
        picture.add("Eric06531.jpg");
        picture.add("Eric06519.jpg");

        Iterator<String> itr = picture.iterator();

        // Generat the HTML boody here
        try {
          //  File file = new File("/Users/Michael/IntelliJExercise/Project/src/main/java/photo.html");



            File file = new  File("/Users/michaellau/mike_albums/ericpictures/eric.html");

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

                printWriter.println("       <div align=@center@><br><p align=@center@><div  class=@rw-ui-container@></div></p></div>");
                  printWriter.println("      </div>");
                printWriter.println("  </div>");
                printWriter.println(" ");
                printWriter.println(" ");

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
