package Class015_Exceptions;

public class EXP_094_Throws_Exception {

    static void validateage(int age) {

        if (age < 18) {
            try {
                throw new RuntimeException("Age less than 18");
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        validateage(16);
    }
}