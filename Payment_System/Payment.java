class Payment {
    public void processPayment(){
        System.out.println("Payment Processing");
    }
}

class CreditCardPayment extends Payment{
    @Override
    public void processPayment(){
    System.out.println("Paid using credit card");
    }
}

class UpiPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Paid using upi");
    }
}

class CashPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Paid using cash");
    }
}
