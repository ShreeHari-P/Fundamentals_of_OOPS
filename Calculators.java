import java.util.Scanner;

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

public class Calculators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.calculate(x, y));
        System.out.println("Subtraction: " + subtraction.calculate(x, y));
        System.out.println("Mutliplication: " + multiplication.calculate(x, y));
        System.out.println("Division: " + division.calculate(x, y));
        scan.close();
    }
}
