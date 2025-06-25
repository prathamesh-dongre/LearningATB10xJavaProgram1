package Class010OOPS_Part2.ParametarisedCons;

public class EXP_056_Param_Const {
    public static void main(String[] args) {
     Bikes Hero = new Bikes("Passion",110);
        System.out.println(Hero.Model_name);
        System.out.println(Hero.CC);
        Hero.display();

        String Modeldata;
        Modeldata=Hero.Give_me_Model_Name();

        System.out.println("Model name is "+Modeldata);
    }

}

class Bikes {
    String Model_name;
    Integer CC;
             Bikes(String Modelname_c,Integer CC_c){
             this.Model_name= Modelname_c;
             this.CC=CC_c;
             }

             void display(){
             System.out.println(this.Model_name+"-"+this.CC);
              }

              String Give_me_Model_Name(){
               return(this.Model_name);
              }

}