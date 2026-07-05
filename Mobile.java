import java.util.Scanner;

public class Mobile implements Cloneable {
    private String brand;
    private String model;
    private int storage;

    public Mobile(String brand, String model, int storage){
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public int getStorage(){return storage;}

    public void setStorage(int storage){
        this.storage = storage;
    }

    @Override
    public Mobile clone(){
        try{
            return (Mobile) super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return "Mobile[brand=" + brand + ", model=" + model +", storage="+storage+"]";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Mobile Details: ");
        String brand = scan.nextLine();
        String model = scan.nextLine();
        int storage = scan.nextInt();

        Mobile original = new Mobile(brand, model, storage);
        Mobile copy = original.clone();

        copy.setStorage(copy.getStorage() * 2);
        System.out.println("Original: " + original);
        System.out.println("Clone: " + copy);
        System.out.println("Storage Equal: " + (original.getStorage() == copy.getStorage()));
        System.out.println("Independent: " + (original != copy));
    }    
}
