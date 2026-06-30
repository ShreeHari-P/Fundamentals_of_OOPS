class PaymentProcessor {
    
    public void processPayment(Payable paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
