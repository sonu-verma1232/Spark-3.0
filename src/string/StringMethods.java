package string;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Sonu Verma";

        // length
        System.out.println(str.length());

        //concatenation
        String s1 = "Sonu";
        String s2 = "Verma";
        System.out.println(s1.concat(" "+s2));

        //string to character

        String s3 = "Sonu Verma";
        char[] arr = s3.toCharArray();
        for(char i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("To char array = "+ Arrays.toString(arr));

        String s4 = "hello";
        String s5 = "hello";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        String  s6 = new String("hello");
        System.out.println(s4.equals(s6));

        String s7 = new String("hello");
        System.out.println(s6.equals(s7));   // it compares content of string

        System.out.println(s6==s7);  // it compares memory address of string
        System.out.println(s4==s5);

    }

}
