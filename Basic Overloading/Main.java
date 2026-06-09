public class Main{
    public static void main(String[] args){
        
        Animal[] myAnimal = new Animal[3];

        myAnimal[0] = new Animal();
        myAnimal[1] = new Dog();
        myAnimal[2] = new Cat();

        for(Animal animals : myAnimal){
            animals.makeSound();
        }

    }
}