package Class015_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String Currency , Integer Amount)
    {
        this.amount=Amount;
        this.currency=Currency;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String Currency1)
    {
         this.currency= Currency1;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankName) throws CustomException {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {

                throw new CustomException("Currency Mismatch, Can't Proceed!");

            }
        }


    }

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}