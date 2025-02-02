package Class003;

import java.util.Scanner;

public class EXPJAVA_011Voting {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter age of user");
          int age = sc.nextInt();

          if (age>=18){
              System.out.println("Eligible for voting");
          }
                  else if(age<0){
                      System.out.println("Enter valid age");
          }
                  else
                      System.out.println("Not eligible to vote");

    }
}
