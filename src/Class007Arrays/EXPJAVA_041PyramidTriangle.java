package Class007Arrays;

public class EXPJAVA_041PyramidTriangle {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        int j=0;

        for(i=0;i<n;i++) {

            for (j = 0; j < n - 1 - i;j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 + 1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
