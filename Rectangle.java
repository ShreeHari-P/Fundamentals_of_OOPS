import java.util.Scanner;

public class Rectangle {
    double length, width;
    
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    public void calculateArea(){
        double area = length * width;
        System.out.println("The Area of the Rectangle is: " + area);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double le = scan.nextDouble();
        double wid = scan.nextDouble();

        Rectangle rect = new Rectangle(le, wid);
        rect.calculateArea();
        scan.close();
    }
}
