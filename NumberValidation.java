import java.util.*;
import java.io.*;

class NumberChecker{
    public static void checkNumber(int n){
        if(n < 0){
            throw new IllegalArgumentException("Negative value");
        }else if(n == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }else if(n > 100){
            throw new NumberFormatException("Too large");
        }
    }
}

class NumberAnalyzer{
    public static void analyzeSpecific(int n){
        try{
            NumberChecker.checkNumber(n);
        }catch(NumberFormatException e){
            System.out.println("Caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}

public class NumberValidation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        NumberAnalyzer.analyzeSpecific(n);
        scan.close();
    }
}