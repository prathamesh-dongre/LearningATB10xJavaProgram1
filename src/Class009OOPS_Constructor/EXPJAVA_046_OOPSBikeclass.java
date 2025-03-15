package Class009OOPS_Constructor;

public class EXPJAVA_046_OOPSBikeclass {

    public static void main(String[] args) {
        Bike Splendor= new Bike();

        System.out.println(Splendor.Make);
        System.out.println(Splendor.Model);
        System.out.println(Splendor.cc);

        System.out.println("______________New Bike Details________________");
        Bike2 Classic= new Bike2();


        System.out.println(Classic.Make);
        System.out.println(Classic.Model);
        System.out.println(Classic.Year);
        System.out.println(Classic.Torque);

        System.out.println("___________Bike2 with parameters_________________");

        Bike2 Triumph = new Bike2("Triumph","Speed400",2023,37);
        System.out.println(Triumph.Make);
        System.out.println(Triumph.Model);
        System.out.println(Triumph.Year);
        System.out.println(Triumph.Torque);

    }

}
