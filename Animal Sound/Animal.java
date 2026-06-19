interface Animal{
    String makeSound();
}

class Dog implements Animal{
    public String makeSound(){
        return "Dog says Woof";
    }
}

class Cat implements Animal{
    public String makeSound(){
        return "Cat says Meow";
    }
}


class Cow implements Animal{
    public String makeSound(){
        return "Cow says Moo";
    }
}
