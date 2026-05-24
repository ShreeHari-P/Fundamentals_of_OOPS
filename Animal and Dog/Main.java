import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Pet name: ");
        String pet = scan.nextLine();

        Child c = new Child(pet);
        c.speak();
        c.bark();
        
        scan.close();   
    }
}