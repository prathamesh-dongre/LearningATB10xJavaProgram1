package Class006Strings;

import java.util.Locale;

public class EXPJAVA_029StringFunctions {
    public static void main(String[] args) {

        String s1="Prathamesh";

        System.out.println(s1.length());

        System.out.println(s1.concat(" Dongre"));

        System.out.println(s1.toUpperCase());

        System.out.println(s1.toLowerCase());

        System.out.println(s1.contains("rat"));

        System.out.println(s1.equalsIgnoreCase("prathamesh"));

        // Returns the index within this string of the
        // first occurrence of the specified substring.

        System.out.println(s1.indexOf("a"));


    }
}
