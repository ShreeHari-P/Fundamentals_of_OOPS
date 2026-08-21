import java.util.*;

enum TrafficLight{
    RED("STOP"), YELLOW("READY"), GREEN("GO");

    private final String action;

    private TrafficLight(String action){
        this.action = action;
    }

    public String getAction(){return action;}
}   

public class TrafficLightSystem{
    public static void main(String[] args){

        for(TrafficLight light : TrafficLight.values()){
            System.out.println(light + " -> " + light.getAction());
        }
    }
}