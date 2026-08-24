import java.util.*;

record Product(String name, double price){
    public Product{
        if(price <= 0) throw new IllegalArgumentException("Invalid Price");
    }

    public double getDiscountedPrice(double discountPercent){
        double discountPrice = price - (price * discountPercent / 100);
        return discountPrice;
    }

    public String printDetails(double discountPercent){
        return """
                Name: %s
                Price: %.2f
                Discount Price: %.2f
                """
                .formatted(name, price, getDiscountedPrice(discountPercent));
    }
}

public class ProductRecord{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double price = scan.nextDouble();
        double discount = scan.nextDouble();

        Product prod = new Product(name, price);
        System.out.println(prod.printDetails(discount));
    }
}