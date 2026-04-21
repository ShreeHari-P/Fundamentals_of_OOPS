import java.util.Scanner;

public class RectangleConstructor {
    int length, width;

    public RectangleConstructor(int l, int w){
        this.length = l;
        this.width = w;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 2 * (length + width);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length and Width: ");
        int le = scan.nextInt();
        int wid = scan.nextInt();

        RectangleConstructor r = new RectangleConstructor(le, wid);
        System.out.println("The area is: " +r.getArea());
        System.out.println("The Perimeter is: " + r.getPerimeter());
        scan.close();
    }
}
