abstract class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    abstract void attack();
}

class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword");
    }
}

class Archer extends Character {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " shoots an arrow");
    }
}

class Mage extends Character {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a spell");
    }
}
