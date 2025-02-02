package Class003;

import java.util.Scanner;

public class EXPJAVA_012Largestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a= sc.nextInt();

        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter Number 2");
        int b= sc.nextInt();

        Scanner sc2 =new Scanner(System.in);
        System.out.println("Enter Number 3");
        int c= sc.nextInt();

        if (a<=b){
            if (b>c){
                System.out.println("Largest no is "+b);
            }
            else {
                System.out.println("Largest no is "+c);
            }
        }
        else if(a>=c){
            System.out.println("Largest no is "+a);
        }
        else {
            System.out.println("Largest no is "+c);
        }

    }
}
