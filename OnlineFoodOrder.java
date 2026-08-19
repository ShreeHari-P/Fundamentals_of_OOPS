import java.util.*;

interface BillFormatter{
    String format();
}

class FoodOrder{
    private String customerName;

    public FoodOrder(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){return customerName;}

    class FoodItem{
        private String foodName;
        private double price;

        public FoodItem(String foodName, double price){
            this.foodName = foodName;
            this.price = price;
        }

        public String getFoodName(){return foodName;}
        public double getPrice(){return price;}
    }

    public String placeOrder(FoodItem item, double tax){
        class TaxCalculator{
            public double calculator(double price){
                double result = price + (price * tax / 100);
                return (result); 
            }
        }

        TaxCalculator taxCalculator = new TaxCalculator();
        double result = taxCalculator.calculator(item.getPrice());

        BillFormatter bill = new BillFormatter(){
           @Override
           public String format(){
                return "--- Bill ---\n" +
                    "Customer: " +  customerName +
                    "\nFood: " + item.getFoodName() +
                    "\nPrice: " + item.getPrice() +
                    "\nTax: " + tax +"%" +
                    "\nTotal: " + result;
           } 
        };

        return bill.format();
    }
}

public class OnlineFoodOrder{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String customerName = scan.nextLine();
        String foodName = scan.nextLine();
        double price = scan.nextDouble();
        double tax = scan.nextDouble();

        FoodOrder food = new FoodOrder(customerName);
        FoodOrder.FoodItem item = food.new FoodItem(foodName, price);

        System.out.println(food.placeOrder(item, tax));
        scan.close();
    }
}