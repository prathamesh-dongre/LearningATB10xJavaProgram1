package Class003;

import java.util.Scanner;

public class EXPJAVA_013LeapYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        Double year = sc.nextDouble();

        if((year%4==0 && year%100!=0)||year%400==0){
            System.out.printf("Year %f is a Leap year",year);
        }
         else{
            System.out.printf("Year %f is not a Leap Year",year);
        }

    }
}
