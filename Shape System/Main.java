public class Main{
    public static void main(String[] args){
        
        Shape shape = new Circle();
        shape.draw();
        
        Circle circle = (Circle) shape;
        circle.draw();
        circle.showRadius();

        System.out.println();

        Shape myShape = new Rectangle();
        myShape.draw();

        Rectangle rectangle = (Rectangle) myShape;
        rectangle.draw();
        rectangle.showLengthBreadth();
    }
}