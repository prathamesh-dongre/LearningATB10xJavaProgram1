package Class004;

import java.util.Scanner;

public class EXPJAVA_016Daysconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days");
        int totaldays= sc.nextInt();
        int year=0 ,month=0, days=0 ;

        if  (totaldays>=365){
            year=totaldays/365;
            totaldays=totaldays%365;
        }
        if (totaldays >= 30) {
            month=totaldays/30;
            totaldays=totaldays%30;
        }
        if(totaldays>0){
            days=totaldays;
        }
        System.out.println("Year "+year + " Month "+month +" Days"+days);
    }
}
