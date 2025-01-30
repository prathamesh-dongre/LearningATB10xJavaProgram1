package Class003;

import java.util.Scanner;

public class EXPJAVA_008EvenOdd {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer no");
        int a= sc.nextInt();

        if (a%2==0){
            System.out.println("No Is EVEN Number");
        }
        else {
            System.out.println("No Is odd No");
        }
    }
}
