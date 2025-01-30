package Class003;

import java.util.Scanner;

public class EXPJAVA_007NO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer no");
        int a= sc.nextInt();
        if (a<0)
        {
            System.out.println("No is negative number");
        }
        else {
            System.out.println("No is positive no");
        }
        sc.close();
    }
}
