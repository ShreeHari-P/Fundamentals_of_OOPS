import java.util.Scanner;
import java.util.Objects;

class Car{
    String registrationNumber;
    String ownerName;
    String model;
    String color;

    public Car(String registrationNumber, String ownerName, String model, String color){
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car myCar = (Car) obj;
        return Objects.equals(registrationNumber, myCar.registrationNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(registrationNumber);
    }
}

public class CarRegistration{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Car Details: ");
        String registrationNumber1 = scan.nextLine();
        String ownerName1 = scan.nextLine();
        String model1 = scan.nextLine();
        String color1 = scan.nextLine();

        System.out.println();
        System.out.println("Enter Car Details: ");
        String registrationNumber2 = scan.nextLine();
        String ownerName2 = scan.nextLine();
        String model2 = scan.nextLine();
        String color2 = scan.nextLine();

        Car car1 = new Car(registrationNumber1, ownerName1, model1, color1);
        Car car2 = new Car(registrationNumber2, ownerName2, model2, color2);
        
        System.out.println();
        System.out.println("Equals: " + (car1.equals(car2)));
        System.out.println("Hash Code: " + (car1.hashCode() == car2.hashCode()));
    }
}