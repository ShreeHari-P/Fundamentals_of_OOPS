import java.util.*;

class Product implements Comparable<Product>{
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
    public int compareTo(Product other){
        if(Double.compare(this.rating, other.rating) != 0){
            return Double.compare(other.rating, this.rating); //rating descending
        }
        if(Double.compare(this.price, other.price) != 0){
            return Double.compare(this.price, other.price); //price ascending
        }
        return this.name.compareTo(other.name); //Name ascending
    }

    @Override
    public String toString(){
        return "Product[productId="+productId+", name="+name+", price="+price+", rating="+rating+"]";
    }
}
public class Amazon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();

            if(line.trim().isEmpty()){
                break;
            }

            String[] parts = line.split(",");
            product.add(new Product(parts[0].trim(), parts[1].trim(), Double.parseDouble(parts[2].trim()), Double.parseDouble(parts[3].trim())));
        }

        Collections.sort(product);

        for(Product myProduct : product){
            System.out.println(myProduct);
        }
        scan.close();
    }
}
