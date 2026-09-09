import java.util.*;

class Pair<T, K>{
     T name;
     K mark;

    public Pair(T name, K mark){
        this.name = name;
        this.mark = mark;
    }

    public T getName(){return name;}
    public K getMark(){return mark;}
}

public class StudentMarkPair{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int mark = scan.nextInt();

        Pair<String, Integer> studentPair = new Pair<>(name, mark);
        System.out.println(studentPair.getName() + " -> " + studentPair.getMark());

        Pair<Integer, String> employee = new Pair<>(101, "Manager");
        System.out.println(employee.getName() + " -> " + employee.getMark());

        Pair<String, Double> product = new Pair<>("Laptop", 65000.50);
        System.out.println(product.getName() + " -> " + product.getMark());
    }
}