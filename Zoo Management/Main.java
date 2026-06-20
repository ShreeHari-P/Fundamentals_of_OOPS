public class Main {

    public static void main(String[] args) {

        SoundMaker[] sounds = {
            new Lion("Lion"),
            new Elephant("Elephant"),
            new Monkey("Monkey")    
        };

        for(SoundMaker sound : sounds){
            sound.makeSound();
        }
    }
}