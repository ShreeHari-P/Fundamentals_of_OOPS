import java.util.*;

enum FoodCategory{
    STARTER(120), MAINCOURSE(250), DESSERT(90), BEVERAGE(60);

    private final int price;

    private FoodCategory(int price){
        this.price = price;
    }

    public int getPrice(){return price;}
}

class FoodItem{
    private String name;
    private FoodCategory category;
    private int quantity;

    public FoodItem(String name, FoodCategory category, int quantity){
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName(){return name;}
    public FoodCategory getCategory(){return category;}
    public int getQuantity(){return quantity;}
}

class Order{
    private ArrayList<FoodItem> items;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item){
        items.add(item);
    }

    public int calculateTotal(){

        int total = 0;
        
        for(FoodItem item : items){

            total += item.getQuantity() * 
                        item.getCategory().getPrice(); 
        }

        return total;
    }

    public void printBill(){
        System.out.println("--------- BILL ---------\n");

    for(FoodItem item : items) {

        int amount = item.getQuantity() * item.getCategory().getPrice();

        System.out.println(item.getName());
        System.out.println(item.getCategory().name());
        System.out.println("Qty: " + item.getQuantity());
        System.out.println("Price: ₹" + amount);
        System.out.println();
    }
    
    System.out.println("Total Amount: ₹" + calculateTotal());
    }
}

public class FoodDeliveryApplication{
    public static void main(String[] args){
        Order order = new Order();

        order.addItem(new FoodItem("Burger", FoodCategory.MAINCOURSE, 2));

        order.addItem(new FoodItem("Ice Cream", FoodCategory.DESSERT, 1));

        order.printBill();

    }
}