package Class015_Exceptions;

public interface EXP_081_Checkedexception {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            //e.printStackTrace(); // This means full problem details with line no.
            //System.out.println(e.getMessage()); // / by zero
            System.out.println("Own message!");
            System.out.println(e.getMessage());
        }
        System.out.println("2");

    }
}
