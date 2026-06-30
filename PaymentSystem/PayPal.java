class PayPal implements Payable {
    
    String email;
    
    public PayPal(String email){
        this.email = email;
    }
    
    @Override
    public String pay(double amount){
        return String.format("Paid %.2f via PayPal account %s",amount,email);
    }
}
