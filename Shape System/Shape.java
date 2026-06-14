class Shape {
    public void draw(){
        System.out.println("Drawing...");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Circle");
    }

    public void showRadius(){
        System.out.println("Circle shows radius");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Rectangle");
    }

    public void showLengthBreadth(){
        System.out.println("Rectangle has Lenght and Breadth");
    }
}
