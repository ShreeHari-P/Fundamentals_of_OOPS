interface SoundMaker {
    void makeSound();
}

abstract class Animal implements SoundMaker{
    protected String name;

    public Animal(String name){
        this.name = name;
    }
}

class Lion extends Animal{
    public Lion(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " Roars");
    }
}

class Elephant extends Animal{
    public Elephant(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " Trumpets");
    }
}

class Monkey extends Animal{
    public Monkey(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " Chatters");
    }
}
