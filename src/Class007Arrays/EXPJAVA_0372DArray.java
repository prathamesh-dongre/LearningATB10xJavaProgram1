package Class007Arrays;

public class EXPJAVA_0372DArray {
    public static void main(String[] args) {

        int[][] array2D= new int[3][2];

        array2D[0][0]= 10;
        array2D[0][1]= 20;
        array2D[0][2]= 30;

        array2D[1][0]= 20;
        array2D[1][1]= 30;
        array2D[1][2]= 10;

        array2D[2][0]= 93;
        array2D[2][1]= 50;
        array2D[2][2]= 80;

        System.out.println(array2D.length);
        for(int i=0;i< array2D.length;i++){
            for(int j=0;j<array2D[i].length;j++){
                System.out.print(array2D[i][j] +"|" );
            }
            System.out.println();
        }


    }
}
