abstract class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getInfo(){
        return "Animal " + name;
    }
    abstract void makeSound();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Buddy Barks...");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Kitty Meows...");
    }
}
