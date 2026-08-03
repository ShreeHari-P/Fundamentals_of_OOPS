import java.util.*;

class Charger{
    private String brand;
    private int watt;

    public Charger(String brand, int watt){
        this.brand = brand;
        this.watt = watt;
    }

    public String getBrand(){return brand;}
    public int getWatt(){return watt;}

    public String charge(){
        return "Charging using " + brand + " " + watt +"W Charger";
    }
}

class Laptop{
    private String brand;
    private int ram;
    private Charger charger;

    public Laptop(String brand, int ram, Charger charger){
        this.brand = brand;
        this.ram = ram;
        this.charger = charger;
    }

    public String getBrand(){return brand;}
    public int getRam(){return ram;}

    public String boot(){
        return "Starting " + getBrand() +" Laptop...\n" +
                charger.charge() +
                "\nWindows Loaded";
    }
}

public class LaptopCharger {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String brand = scan.nextLine();
        int watt = scan.nextInt();
        int ram = scan.nextInt();

        Charger charger = new Charger(brand, watt);
        Laptop laptop = new Laptop(brand, ram, charger);

        System.out.println(laptop.boot());
        scan.close();
    }    
}
