public class Main{
    public static void main(String[] args){
        
        Dog dog = new Dog("Husky");
        Cat cat = new Cat("Brown");

        AnimalChecker[] myAnimal = {dog, cat};

        for(AnimalChecker animal : myAnimal){
            animal.makeSound();

            if(animal instanceof Dog myDog){
                myDog.showBreed();
                System.out.println();
            }else if(animal instanceof Cat myCat){
                myCat.showColor();
            }
        }
    }
}