import java.io.File;

public class renameFile
{
    public static void main(String[] args)
    {

        File oldfile =new File("/mike_albums/portrait/Azion4566.JPG");
        File newfile =new File("nmike_albums/portrait/newfiles/Azion4566P.JPG");

        if(oldfile.renameTo(newfile)){
            System.out.println("Rename succesful");
        }else{
            System.out.println("Rename failed");
        }

    }
}

