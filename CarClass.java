import java.util.Scanner;

public class CarClass {
    private String brand;
    private int speed;

    public CarClass(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increment){
        if(increment > 0)
            this.speed += increment;
    }

    public void brake(int decrement){
        if(decrement > 0)
            this.speed -= decrement;
            if(this.speed < 0)
                this.speed = 0;
    }

    public void getSpeed(){
        if(this.speed < 0){
            System.out.println("Invalid Speed");
        }else{
            System.out.println("The " + brand + " car takes speed of " + this.speed);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Brand then The Speed");
        String brand = sc.nextLine();
        int speed = sc.nextInt();

        CarClass c = new CarClass(brand, speed);
        System.out.print("Enter Acceleration Speed: ");
        int accelerate = sc.nextInt();
        c.accelerate(accelerate);
        
        System.out.print("Enter Deceleration Speed: ");
        int deceleration = sc.nextInt();
        c.brake(deceleration);

        c.getSpeed();
        sc.close();
    }
}
