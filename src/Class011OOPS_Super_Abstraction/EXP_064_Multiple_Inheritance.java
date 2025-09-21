package Class011OOPS_Super_Abstraction;

public class EXP_064_Multiple_Inheritance {

  public static void main (String agrs[]) {
      Child c1 = new Child();
      c1.money();
      c1.f1();
  }

}
class Child implements Mother , Father {
    @Override
    public void money(){
        System.out.println("Money override");
    }

    @Override
    public void f1() {
        Father.super.f1();
    }

    @Override
    public void goldf1() {

    }

    @Override
    public void goldM1() {

    }
}

interface Mother {
void money();
void goldM1();
}


interface Father {

    void money ();
    void goldf1();

    default void f1 (){
        System.out.println("f1 print");
    }
}