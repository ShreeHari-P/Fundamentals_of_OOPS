public class Main{
    public static void main(String[] args){
        
        Product[] myProduct = {
            new Electronics(),
            new Clothing()
        };

        for(Product prod : myProduct){
            prod.showProduct();

            if(prod instanceof Electronics ele){
                ele.showWarrenty();
                System.out.println();
            }else if(prod instanceof Clothing cloth){
                cloth.showSize();
            }
        }
    }
}