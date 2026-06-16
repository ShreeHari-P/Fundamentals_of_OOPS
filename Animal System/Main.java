public class Main{
    public static void main(String[] args){

        Animal[] animal = {new Dog("Bob"), 
                            new Cat("Tom")
        };

        for(Animal animals : animal){
            System.out.println(animals.getInfo());
            animals.makeSound();
            System.out.println();
        }
    }
}