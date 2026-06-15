class AnimalChecker {
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends AnimalChecker{
    String breed;

    public Dog(String breed){
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("Dog Barks...");
    }

    public void showBreed(){
        System.out.println(breed + " breed Dog");
    }
}

class Cat extends AnimalChecker{
    String color;

    public Cat(String color){
        this.color = color;
    }

    @Override
    public void makeSound(){
        System.out.println("Cat Meow...");
    }

    public void showColor(){
        System.out.println(color + " colour cat");
    }
}
