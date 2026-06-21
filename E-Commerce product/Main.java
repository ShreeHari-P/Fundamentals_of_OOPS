public class Main {

    public static void main(String[] args) {

        Discountable[] myDiscount = {
            new Laptop("Laptop",5000),
            new Mobile("Mobile",3000),
            new Headphones("Headphones",1000)
        };

        for(Discountable discount : myDiscount){
            System.out.println(discount.applyDiscount());
        }
    }
}