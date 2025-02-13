package Class004;

import java.util.Scanner;

public class EXPJAVA_015Divisible5and11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no");
        int num= sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("No is divisible by 5 & 11");
        }
        else
            System.out.println("No is not divisible");

    }
}
