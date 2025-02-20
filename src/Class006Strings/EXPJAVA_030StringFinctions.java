package Class006Strings;

public class EXPJAVA_030StringFinctions {
    public static void main(String[] args) {

        String name = "Patthi";

        // Give length of String
        System.out.println(name.length());

        //Concatinate with string
        System.out.println(name.concat("Dong"));

        //contains gives id data is present in string- bollen output
        System.out.println(name.contains("tt"));

        //Compares value of string- boolean value
        System.out.println(name.equals("Sonal"));

        // 5. equalsIgnoreCase()--compare without Case
        System.out.println(name.equalsIgnoreCase("patthI"));

        // 6. indexOf() //  Patthi -> ? o
        //return index of first occurence
        System.out.println(name.indexOf('t'));

        // Replace specifird value with other value
        System.out.println(name.replace('t', 'N'));

        //Split- split from regex value
        String name4 = "prathamesh8@mail.com";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        //System.out.println(split[2]);

        //Substring- Patthi  (2,5) include first index and exclude last one
        System.out.println(name.substring(1, 3));
        String a1 ="TESTINGJAVA";
        System.out.println(a1.substring(2,5));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()- true if string starts with value
        System.out.println(name.startsWith("S"));

        // 15. endsWith()- true if string ends with value
        System.out.println(name.endsWith("i"));

        // 17. trim()- removes start and end spaces
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Patthi"));

        String s3= name+a1;
        System.out.println(s3);
        System.out.println(name.concat(a1));





    }
}
