import java.util.Scanner;

public class Car {
    String brand;
    int speed;

    public void display(){
         System.out.println("The Car brand is " + brand + " and moves at a speed of " + speed);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Car c = new Car();
        c.brand = scan.nextLine();
        c.speed = scan.nextInt();

        c.display();
        scan.close();
    }
}
