import java.util.Scanner;

public class Laptops implements Cloneable {
    private String brand;
    private String model;
    private double price;

    public Laptops(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public double getPrice(){return price;}

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public Laptops clone(){
        try{
            return (Laptops) super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return "Laptop[brand="+brand+", model="+model+", price="+price+"]";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Details: ");
        String brand = scan.nextLine();
        String model = scan.nextLine();
        double price = scan.nextDouble();

        Laptops original = new Laptops(brand, model, price);
        Laptops copy = original.clone();
        copy.setPrice(copy.getPrice() - 500);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + copy);
        System.out.println("Independent: " +(original != copy));
        scan.close();
    }
}
