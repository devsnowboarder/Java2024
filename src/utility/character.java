package utility;

public class character {


        public static void findUpperChar ( String str){


            for( int i=0; i < str.length()-1 ; i++){

                if(Character.isUpperCase(str.charAt(i)))
                    System.out.println(str.charAt(i));


            }
        }

        public static char firstLetterChar ( String str) {

            System.out.println("  ");
            for ( int i =0;i <  str.length() -1; i++) {

                if(Character.isLetter(str.charAt(i))) {
                    System.out.println(str.charAt(i));
                    return str.charAt(i);
                }
            }

          return '0';
        }


}
