package Class007Arrays;

import java.util.Arrays;

public class EXPJAVA_039ArraySorting {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
            int a=0;
        for (int i = 0; i < numbers.length-1; i++)
             for (int j=0; j<numbers.length-1-i;j++){
                 if(numbers[j]>numbers[j+1]){
                     a=numbers[j];
                     numbers[j]=numbers[j+1];
                     numbers[j+1]=a;
                 }
             }
        for (int num :numbers){
            System.out.println(num);
        }

    }
}
