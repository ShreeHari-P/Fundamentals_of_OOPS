import java.util.Scanner;

@FunctionalInterface
interface NumberCheck{
    boolean check(int n);
}

public class NumberChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        NumberCheck even = (a) -> a%2 == 0;
        NumberCheck odd  = (a) -> a%2 != 0;
        NumberCheck positive = (a) -> a > 0;
        NumberCheck negative = (a) -> a < 0;

        System.out.println("Even: " + even.check(n));
        System.out.println("Odd: " + odd.check(n));
        System.out.println("Positive: " + positive.check(n));
        System.out.println("Negative: " + negative.check(n));
    }
}
