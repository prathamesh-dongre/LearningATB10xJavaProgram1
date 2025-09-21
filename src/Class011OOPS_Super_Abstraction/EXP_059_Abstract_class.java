package Class011OOPS_Super_Abstraction;

public class EXP_059_Abstract_class {
    public static void main(String[] args) {
        Child1 c  = new Child1();
        c.loan50k();
        c.loan25k();

        //Father f1 = new Father(); // Abstract classes don't have any object.
    }
}

// abstract class -
abstract class Father1{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 20K");
    }
}

class Child1 extends Father1{

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan!");
    }
}
