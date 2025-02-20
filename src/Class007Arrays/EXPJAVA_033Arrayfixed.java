package Class007Arrays;

public class EXPJAVA_033Arrayfixed {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 20;
        array[1] = 45;
        array[2] = 20;
        array[3] = 50;
        array[4] = 99;

        Integer i = 0;

        for (i = (array.length-1); i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
