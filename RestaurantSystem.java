import java.util.*;

class Chef{
    private String name;
    private String specialization;

    public Chef(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public String getName(){return name;}
    public String getSpecalization(){return specialization;}

    public String toString(){
        return "Chef: " + name + " ("+specialization+")";
    }
}

class Dish{
    private String dishName;
    
    public Dish(String dishName){
        this.dishName = dishName;
    }

    public String getDishName(){return dishName;}

    public String toString(){
        return dishName;
    }
}

class Restaurant{
    private String restaurantName;
    private Chef chef;
    private Dish[] dishes;

    public Restaurant(String restaurantName, Chef chef, int numDishes){
        this.restaurantName = restaurantName;
        this.chef = chef;
        this.dishes = new Dish[numDishes];
        for(int i = 0; i < numDishes; i++){
            this.dishes[i] = new Dish("Dish " + (i+1));
        }
    }

    public String getRestaurantName(){return restaurantName;}

    public String getInfo(){
        return "Restaurant: " + restaurantName + "\n" +
                chef.toString();
    }

    public String listDishes(){
        String result = "";
        for(int i = 0; i < dishes.length; i++){
            result += dishes[i].toString() + "\n";
        }
        return result.trim();
    }
}

public class RestaurantSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String chefName = scan.nextLine();
        String specialization = scan.nextLine();
        String restaurantName = scan.nextLine();
        int numDishes = scan.nextInt();

        Chef chef = new Chef(chefName, specialization);
        Restaurant restaurant = new Restaurant(restaurantName, chef, numDishes);

        System.out.println(restaurant.getInfo());
        System.out.println();
        System.out.println(restaurant.listDishes());
        scan.close();
    }
}
