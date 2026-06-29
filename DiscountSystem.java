import java.util.*;

@FunctionalInterface
interface Discount{
    double apply(double price);
}

class Billing{
    Discount discount;

    public Billing(Discount discount){
        this.discount = discount;
    }

    double getFinalPrice(double price){
        return discount.apply(price);
    }
}

public class DiscountSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double price = scan.nextDouble();

        Billing bill10 = new Billing(amt -> amt - (amt * 0.10));
        Billing bill20 = new Billing(amt -> amt - (amt * 0.20));
        Billing bill50 = new Billing(amt -> amt - (amt * 0.50));

        System.out.println("10% Discount = " + bill10.getFinalPrice(price));
        System.out.println("20% Discount = " + bill20.getFinalPrice(price));
        System.out.println("30% Discount = " + bill50.getFinalPrice(price));
        scan.close();
    }
}
