package Class003;

import java.util.Scanner;


public class EXPJAVA_014GradeCalculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Persentage 1");
        int percent= sc.nextInt();

        if (percent<0 || percent>100){
            System.out.println("Enter valid percent between 0-100");
            System.exit(0);
        }
         if(percent>=0 && percent<40){
             System.out.println("Garade is Fail");
         } else if (percent>=40 && percent<=49) {
             System.out.println("Garade is E");
         }
         else if (percent>=50 && percent<=59) {
             System.out.println("Garade is D");
         }
         else if (percent>=60 && percent<=69) {
             System.out.println("Garade is C");
         }
         else if (percent>=70 && percent<=79) {
             System.out.println("Garade is B");
         }
         else if (percent>=80 && percent<=89) {
             System.out.println("Garade is A");
         }
         else if (percent>=90 && percent<=109) {
             System.out.println("Garade is A+");
         }

    }

}
