abstract class Vehicle{
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }

    public int getSpeed(){
        return speed;
    }

    abstract void move();
}

class Car extends Vehicle{
    public Car(String brand, int speed){
        super(brand, speed);
    }

    @Override
    void move(){
        System.out.println(getBrand() + " car is driving at " + getSpeed() + " km/h");
    }
}

class Bike extends Vehicle{
    public Bike(String brand, int speed){
        super(brand, speed);
    }

    @Override
    void move(){
        System.out.println(getBrand() + " bike is driving at " + getSpeed() + " km/h");
    }
}

class Train extends Vehicle{
    public Train(String brand, int speed){
        super(brand, speed);
    }

    @Override
    void move(){
        System.out.println(getBrand() + " train is driving at " + getSpeed() + " km/h");
    }
}
