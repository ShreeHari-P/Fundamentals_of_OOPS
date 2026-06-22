interface Orderable{
    void placeOrder();
}

interface Trackable{
    void trackOrder();
}

interface Payable{
    void makePayment();
}

public class FoodOrder implements Orderable, Trackable, Payable{
    @Override
    public void placeOrder(){
        System.out.println("Order placed");
    }

    @Override
    public void trackOrder(){
        System.out.println("Tracking Order");
    }

    @Override
    public void makePayment(){
        System.out.println("Payment Successful");
    }

    public static void main(String[] args){

        FoodOrder food = new FoodOrder();
        food.placeOrder();
        food.trackOrder();
        food.makePayment();
    }
}
