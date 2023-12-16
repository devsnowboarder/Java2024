public class ReplaceString {

    public static void main(String a[]) {

        String str ="This is an example";
        String[] str2 ={"a","x","s"};



        char array[] = {'a', 'b', 'c'};


        char[] test2 = str.toCharArray();

        for( int i=0; i < str2.length;i++) {
            if (str.contains(str2[i])) {
                test2[str.indexOf(str2[i])]=' ';
            }
        }
        str = String.valueOf(test2);

/*
     StringBuilder sb = new StringBuilder();
        for ( int i =0; i < test2.length; i++)
            if ( test2[i] !=' ')
            sb= sb.append(test2[i]);


*/
        System.out.println(str.replaceAll(" ",""));

        String test ="Hello";

        test = test.replaceAll("e","xx");
        System.out.println(test);

        String st6 = String.valueOf(array);

        System.out.println(st6);





    }
}
