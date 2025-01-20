package Class002;

public class EXPJAVA_005_TO_GradeCalc {
    public static void main(String[] args) {
        int s = 83;

       String Grade= (s>0 && s<=59) ? "F" : (s>60 && s<=69) ?"D" : (s>70 && s<=79)? "C" :(s>80 && s<=89) ? "B" :(s>90 && s<=100)? "A": "Invalid Marks Entered" ;
                System.out.printf("Student grade is "+Grade);
       }

    }

