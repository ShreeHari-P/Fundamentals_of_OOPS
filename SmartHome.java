import java.util.*;

class Door{
    public String open(){
        return "Opening Door...";
    }
}

class Fan{
    public String start(){
        return "Turning on Lights...";
    }
}

class Light{
    public String on(){
        return "Starting Fan...";
    }
}

class Ac{
    public String cool(){
        return "Cooling Room...";
    }
}

class Home{
    private Door door;
    private Fan fan;
    private Light light;
    private Ac ac;

    public Home(Door door, Fan fan, Light light, Ac ac){
        this.door = door;
        this.fan = fan;
        this.light = light;
        this.ac = ac;
    }

    public String activateHome(){
        return door.open() + "\n" +
                fan.start() + "\n" +
                light.on() + "\n" +
                ac.cool() + "\n" +
                "Welcome Home!";
    }     
}

public class SmartHome {
    public static void main(String[] args) {

        Door door = new Door();
        Fan fan = new Fan();
        Light light = new Light();
        Ac ac = new Ac();

        Home home = new Home(door, fan, light, ac);
        System.out.println(home.activateHome());
    }
}
