package Class011OOPS_Super_Abstraction;

public class EXP_058_Private {
    public static void main(String[] args) {
        PPQ C1 = new PPQ();
        C1.display();
    }
}

class XYZ{
    XYZ (){

    }
    protected int gold = 10;
}

class PPQ extends XYZ{
     void display(){
         System.out.println(super.gold);
     }
        }