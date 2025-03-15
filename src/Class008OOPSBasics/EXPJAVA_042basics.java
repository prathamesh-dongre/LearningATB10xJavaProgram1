package Class008OOPSBasics;

public class EXPJAVA_042basics {
 public static void main (String[] args){
     Studentclass Ram= new Studentclass();
     Ram.name="RAM";
     Ram.salary=10000;
     Ram.age=20;

     Ram.eat();
     Studentclass Pramod= new Studentclass();
     Pramod.name="Pramod Kumar";
     Pramod.address="7D Roya residency Mumbai ";
     Pramod.age=30;


     System.out.println(Pramod.name);
     System.out.println(Pramod.address);
     System.out.println(Pramod.age);
     Pramod.speak();

 }

}
