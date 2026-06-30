import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cardNumber = scanner.nextLine();  // Last 4 digits
        String email = scanner.nextLine();       // PayPal email
        double amount = scanner.nextDouble();    // Payment amount
        
        PaymentProcessor payment = new PaymentProcessor();
        
        CreditCard credit = new CreditCard(cardNumber);
    
        PayPal paypal = new PayPal(email);
      
        System.out.println(credit.pay(amount));
      
        System.out.println(paypal.pay(amount));
    }
}
