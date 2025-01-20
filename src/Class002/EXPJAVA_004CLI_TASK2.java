package Class002;

public class EXPJAVA_004CLI_TASK2 {
    public static  void main (String args[]){
        int n= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int max= (n >b) ? n : b;
        System.out.printf("Maximum no is %d",max);

    }
}
