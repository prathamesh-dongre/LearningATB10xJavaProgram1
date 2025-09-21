package Class011OOPS_Super_Abstraction;

public class EXP_066_Dynamic_Dispatch {
    public static void main(String[] args) {
        Pramod d = new Dutta(); // Dynamic Dispatch will Interface
        Dutta d1 = new Dutta();// Dynamic Dispatch will Interface
      //  Dutta d2 = new Pramod(); --- Not allowed
        d.display();
        System.out.println(d.a);

        // Webdriver driver = new ChromeDriver(); // Dynamic Dispatch
    }
}


class Dutta implements Pramod{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Pramod{
    public int a = 10;
    void display();
}

