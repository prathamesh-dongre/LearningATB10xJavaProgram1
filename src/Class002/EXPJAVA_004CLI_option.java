package Class002;

public class EXPJAVA_004CLI_option {
    public static void main (String [] args) {
        String name= args[0];
        int age= Integer.parseInt(args[1]);
        int salary= Integer.parseInt(args[2]);


        System.out.println("Name, age, salary are :" +name +" " +age+ " " +salary);

    }
}
