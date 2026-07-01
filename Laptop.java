import java.util.Scanner;
import java.util.Objects;

class Lap{
    String serielNumber;
    String brand;
    int ram;
    String processor;

    public Lap(String serielNumber, String brand, int ram, String processor){
        this.serielNumber = serielNumber;
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Lap lap = (Lap) obj;
        return Objects.equals(serielNumber, lap.serielNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(serielNumber);
    }
}

public class Laptop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Laptop serielNo, brand, ram, processor: ");
        String serielNumber1 = scan.nextLine();
        String brand1 = scan.nextLine();
        int ram1 = scan.nextInt();
        scan.nextLine();
        String processor1 = scan.nextLine();

        System.out.println();
        System.out.println("Enter Laptop serielNo, brand, ram, processor: ");
        String serielNumber2 = scan.nextLine();
        String brand2 = scan.nextLine();
        int ram2 = scan.nextInt();
        scan.nextLine();
        String processor2 = scan.nextLine();

        Lap lap1 = new Lap(serielNumber1, brand1, ram1, processor1);
        Lap lap2 = new Lap(serielNumber2, brand2, ram2, processor2);

        System.out.println();
        System.out.println("Laptop 1 == Laptop 2: " + (lap1 == lap2));
        System.out.println("Laptop 1 Equals Laptop 2: " + (lap1.equals(lap2)));
        System.out.println("Hash Code: " + (lap1.hashCode() == lap2.hashCode()));
        scan.close();
    }
}
