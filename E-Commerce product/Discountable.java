interface Discountable {
    String applyDiscount();
}

abstract class Product implements Discountable{
    protected String name;
    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class Laptop extends Product{
    public Laptop(String name, int price){
        super(name, price);
    }

    @Override
    public String applyDiscount(){
        return name + " Discount " + price + " is applied";   
    }
}

class Mobile extends Product{
    public Mobile(String name, int price){
        super(name, price);
    }

    @Override
    public String applyDiscount(){
        return name + " Discount " + price + " is applied";
    }
}

class Headphones extends Product{
    public Headphones(String name, int price){
        super(name, price);
    }

    @Override
    public String applyDiscount(){
        return name + " Discount " + price + " is applied";
    }
}
