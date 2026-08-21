import java.util.*;

enum DataPlan{
    BASIC(199), STANDARD(399), PREMIUM(699);

    private final int price;

    private DataPlan(int price){
        this.price = price;
    }

    public int getPrice(){return price;}

    public String getDescription(){
        return String.format("%s - %d",this.name(), this.price);
    }
}

public class MobileDataPlan{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toUpperCase();
        DataPlan plan = DataPlan.valueOf(input);
        System.out.println("Selected Plan: " + plan);
        System.out.println("Price: " + plan.getPrice());
        System.out.println();

        for(DataPlan data : DataPlan.values()){
            System.out.println(data.getDescription());
        }
    }
}