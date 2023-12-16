import java.io.File;


public class readFileDirectoryHTML {

    public static void main(String[] args)
    {
        int count=0;
        File folder = new File("/Users/michaellau/mike_albums/ericpictures/images");

        String[] files = folder.list();

        for (String file : files)
        {
            System.out.println("picture.add("+"@"+file+"@"+");");
            count++;

        }

        System.out.println(count);
    }

}
