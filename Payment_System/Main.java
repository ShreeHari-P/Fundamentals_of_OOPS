public class Main{
    public static void main(String[] args){
        
        Payment[] payments = new Payment[4];

        payments[0] = new Payment();
        payments[1] = new CreditCardPayment();
        payments[2] = new UpiPayment();
        payments[3] = new CashPayment();

        for(Payment payment : payments){
            payment.processPayment();
        }

    }
}