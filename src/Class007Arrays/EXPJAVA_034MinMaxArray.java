package Class007Arrays;

public class EXPJAVA_034MinMaxArray {
    public static void main(String[] args) {

        int[] array= {20,29,54,95,298,2,47,7,235,98282,100};

        int maxoutput=give_max(array);
        int minoutput=give_min(array);
        int sumofarray=sumofarray(array);
    }

      static int give_max(int[] array){

          int i=0;
          int max=0;
          for(i=0;i<array.length;i++)
          {
              if(max<array[i])
              {
                  max=array[i];
              }
          }
          System.out.println("maximum no in array is "+max);
          return max;
      }

      static int give_min(int[] array){
          int min=array[0];
          int i=0;

          for(i=0;i<array.length;i++){
              if(array[i]<min){
                  min=array[i];
              }
          }
          System.out.println("Minimum no in array is  "+min);
          return min;
      }

          static int sumofarray(int[]array){
              int sum=0;
              int i=0;

              for(i=0;i<array.length;i++){
                  sum=sum+array[i];
              }
              System.out.println("Sum of no in array is "+sum);
            return sum;
          }

}




