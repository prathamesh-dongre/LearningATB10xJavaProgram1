package Class007Arrays;

import java.util.Scanner;

public class EXPJAVA_040Rightangletriangle {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = scanner.nextInt();
        //Inverted Right Angle triangle
        for (i=0;i<n;i++) {
            for (j = 0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_________________________");
        System.out.println();
            //Right angle triangle
        for (i=0;i<n;i++) {
            for (j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
