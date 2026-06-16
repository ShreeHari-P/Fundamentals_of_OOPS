class Product {
    public void showProduct(){
        System.out.println("Shopping products");
    }       
}

class Electronics extends Product{
    @Override
    public void showProduct(){
        System.out.println("Electronic products");
    }

    public void showWarrenty(){
        System.out.println("Shows warrenty");
    }
}

class Clothing extends Product{
    @Override
    public void showProduct(){
        System.out.println("Clothing products");
    }

    public void showSize(){
        System.out.println("Shows size");
    }
}
