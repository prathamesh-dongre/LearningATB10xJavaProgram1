package Class011OOPS_Super_Abstraction;

public class EXP_060_AC_ABSTRACT {

    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        wagonR.drive();
        wagonR.startEngine();
        wagonR.stopEngine();
    }

}

// Car -> Engine, Start, Stop
// Wagon R -> Car


class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Start");
    }

    void drive(){
        startEngine();
        System.out.println("I am driving");
        stopEngine();
    }
}



abstract class Engine{

    Engine(){
        // This is useless
    }

    abstract void startEngine();
    void stopEngine() {
        System.out.println("Stop");
    }
}

interface Tyre{
    //    void m1(){
//
//    }
    void m2();

    // Tyre(){} No constructor
}