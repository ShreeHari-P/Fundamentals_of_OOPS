class CreditCard implements Payable {

    String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    
    @Override
    public String pay(double amount){
        return String.format("Paid %.2f using Credit Card ending in %s",amount,cardNumber);
    }
}
