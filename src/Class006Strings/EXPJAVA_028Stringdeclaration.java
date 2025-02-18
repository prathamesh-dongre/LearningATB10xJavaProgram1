package Class006Strings;

public record EXPJAVA_028Stringdeclaration() {
    public static void main(String[] args) {
        String s1="Hello";//created in SCP
        String s2="Hello";

        String s3= new String("Hello");// ceated in Heap area
        String s4= new String("HeLlo");

        // == ?  Comparsion -> Strings -> This check the locations ref.
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        //equals ( content) -> value
        // How can I check the values? equals == value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
