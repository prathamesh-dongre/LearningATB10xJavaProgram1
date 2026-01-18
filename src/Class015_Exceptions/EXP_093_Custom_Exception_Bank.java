package Class015_Exceptions;

public class EXP_093_Custom_Exception_Bank {

    public static void main(String[] args)
    {
        Bank hdfc = new Bank("INRrr",100);

           //hdfc.setCurrency("IRRR");
           System.out.println(hdfc.getCurrency());
           System.out.println(hdfc.getAmount());

        Bank icic= new Bank("INRR",200);
        System.out.println(hdfc.add(icic));

    }
}
