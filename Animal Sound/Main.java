public class Main {

    public static void main(String[] args) {

        Animal[] animal = {new Dog(), new Cat(), new Cow()};

        for(Animal myAnimal : animal){
            System.out.println(myAnimal.makeSound());
        }
    }
}