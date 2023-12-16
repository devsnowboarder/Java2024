public class subString
{
    public static void main(String args[]){
        //creating a string by java string literal
        String str = "Beginnersbook";



        char arrch[]={'h','e','l','l','o'};


        //converting char array arrch[] to string str2

        String str2 = new String(arrch);



        //creating another java string str3 by using new keyword
        String str3 = new String("Java String Example");



        //Displaying all the three strings


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);


        System.out.println("remove character "+ str3.replace('a',' '));
        System.out.println("remove spaces " + (str3.replace(" ","")));

        System.out.println("index character "+ str3.indexOf('a'));

        System.out.println("First Accurancey "+str3.substring(0,1)+str3.substring(2, str3.length()));



        String str1 = new String("This is a Beginners     Book tutorial");
        String str2x = new String("Beginners");
        String str3x = new String("Book");
        String str4 = new String("Books");


        System.out.println("  The substring ater the 10th position " +str1.substring(10));

        System.out.println(" The substring between 2 and 20  "+str1.substring(2,20));

        String UP = str1.substring(0,1).toUpperCase();
        String Lower = str1.substring(1).toLowerCase();



        String [] listTest ={"123", "This", "is", "a", "test"};

        String stTest = "Golden State Warriors";


        System.out.println(" The postion 1  "+str1.substring(0,1).toUpperCase());
        System.out.println("ALL Lower  "+str1.substring(1).toLowerCase().replace(" ",""));

        System.out.println(" Concat " + UP+Lower);



        System.out.println("Index of B in str1: "+str1.indexOf('B'));

        System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15));

        System.out.println("Index of B in str1 after 30th char:"+str1.indexOf('B', 30));

        System.out.println("Index of string str2 in str1:"+str1.indexOf(str2x));

        System.out.println("Index of str2 after 15th char"+str1.indexOf(str2x, 15));

        System.out.println("Index of string str3:"+str1.indexOf(str3));

        System.out.println("Index of string str4"+str1.indexOf(str4));

        System.out.println("Index of harcoded string:"+str1.indexOf("is"));

        System.out.println("Index of hardcoded string after 4th char:"+str1.indexOf("is", 4));


        char[] carArray = str3.toCharArray();


        for (char ch : carArray)
        {
            System.out.println(ch + " " + str3.indexOf(ch));
        }

        //  if (Character.isLetter(str.charAt(i)))

           for ( int i=0; i < str.length();i++) {
               System.out.println(str.substring(i));
               if (Character.isLetter(str.charAt(i)))
                   System.out.println("Character");

                 if ( Character.isUpperCase(str.charAt(i)))
                     System.out.println("Upper");

                 if ( Character.isLowerCase(str.charAt(i)))
                       System.out.println("Lower");

                if ( Character.isLowerCase(str1.indexOf(str.charAt(i))))
                   System.out.println("True");
               else
                   System.out.println("False");


           }




        for ( int i=str.length()-1; i > -1;i--)
            System.out.println(str.substring(i));
    }
}