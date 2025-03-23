package Class010OOPS_Part2.ecap;

public class EXPJAVA_049Bankupdate {
//  Fetch Bank details of customer
    //Update bank balance of customer
public static void main(String[] args) {
    Bankdetails User1= new Bankdetails();


User1. setName("AMIT");
User1.setBalance(10000L, true);
    System.out.println(User1.getName());
    System.out.println(User1.getBalance());

}

}

class Bankdetails{
      private String Name;
      private Long Balance;

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setBalance(Long balance ,Boolean IsCashier ) {
        if(IsCashier){
            this.Balance= balance;
        }
        else{
            System.out.println("Not authorised to update Balance");
        }

    }

    public Long getBalance() {
        return Balance;
    }
}
