class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println(name + " makes a sound");
    }
}

class Child extends Animal{

    public Child(String name){
        super(name);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }
}
