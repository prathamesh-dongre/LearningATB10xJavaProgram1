package Class007Arrays;

import java.util.Scanner;

public class EXPJAVA_035UserinputArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array length");
        int size= sc.nextInt();

        int[] array= new int[size];

        for(int i=0;i<array.length;i++) {
            System.out.println("Enter No at index" + i);
            array[i] = sc.nextInt();
            System.out.println("value at index " + i + " is " + array[i]);
            System.out.println();
        }



    }
}
