public class Main {

    public static void main(String[] args) {

        Character[] characters = {
            new Warrior("Thor", 100),
            new Archer("Robin", 80),
            new Mage("Merlin", 60)
        };

        for (Character character : characters) {
            character.attack();
        }
    }
}