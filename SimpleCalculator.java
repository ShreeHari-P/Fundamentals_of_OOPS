import java.util.Scanner;

public class SimpleCalculator {
    
    public int add(int a, int b){
        return a + b;
    }

    public double add(int a, int b, int c){
        return a + b + c;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter four numbers space by: ");
        int a = scan.nextInt(); int b = scan.nextInt();
        int c = scan.nextInt(); int d = scan.nextInt();

        SimpleCalculator s = new SimpleCalculator();
        System.out.println("Add Two: " + s.add(a, b));
        System.out.println("Add Three: " + s.add(a, b, c));
        System.out.println("Add Four: " + s.add(a, b, c, d));
        scan.close();
    }
}
