package Class006Strings;

public class EXPJAVA_031StringBuilder_SringBuffer {
    public static void main(String[] args) {

        StringBuilder SB= new StringBuilder("Chatrapati");
        SB.append(" Maharaj");
        System.out.println(SB);

        StringBuffer Sbuffer= new StringBuffer("KING ");
        System.out.println(Sbuffer);
        Sbuffer.append(SB);
        System.out.println(Sbuffer);

        SB.reverse();
        System.out.println(SB);

        Sbuffer.capacity();
        System.out.println(Sbuffer.capacity());
        System.out.println(Sbuffer.delete(2,9));

    }
}
