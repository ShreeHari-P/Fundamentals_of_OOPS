import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Product{
    private String productId;
    private String name;
    private double price;
    private double rating;

    public Product(String productId, String name, double price, double rating){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getProductId(){return productId;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public double getRating(){return rating;}

    @Override
    public String toString(){
        return "Product[name="+name+", price="+price+", rating="+rating+"]";
    }
}

class ProductRankingComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2){
        if(Double.compare(p1.getRating(),p2.getRating()) == 0){

            if(Double.compare(p1.getPrice(), p2.getPrice()) == 0){
                return p1.getName().compareTo(p2.getName());
            }

            return Double.compare(p1.getPrice(), p2.getPrice());
        }
        return Double.compare(p2.getRating(), p1.getRating());
    }
}

public class ECommerce {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Product> product = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            String line = scan.nextLine();
            String[] parts = line.split(",");
            product.add(new Product(
                parts[0].trim(), parts[1].trim(),
                Double.parseDouble(parts[2].trim()), Double.parseDouble(parts[3].trim())
            ));
        }

        System.out.println();
        Collections.sort(product, new ProductRankingComparator());
        for(Product p : product){
            System.out.println(p);
        }
    }    
}
