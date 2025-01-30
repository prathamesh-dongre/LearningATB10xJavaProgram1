package Class003;

import java.util.Scanner;

public class EXPJAVA_009VowelConsonant {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Please ender only charecter");
         char S = sc.next().charAt(0);

         if (S=='A'||S=='E'||S=='I'||S=='O'||S=='U'){
             System.out.println("Entered Charector is Vowel");
         }
         else{
             System.out.println("Entered Charector is Consonent");
         }

    }
}
