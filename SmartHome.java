interface SmartDevice{
    void turnOn();

    default void activate(){
        System.out.println("Activating device...");
        turnOn();
    }

    static String deviceInfo(){
        return "Smart Home Device";
    }
}

class SmartLight implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("SmartLight is turned ON");
    }
}

class SmartFan implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("SmartFan is turned ON");
    }

    @Override
    public void activate(){
        System.out.println("Fan Special Activation...");
        turnOn();
    }
}

class SmartAC implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("SmartAC is turned ON");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        
        System.out.println(SmartDevice.deviceInfo());
        SmartDevice[] smart = {
            new SmartLight(),
            new SmartFan(),
            new SmartAC()
        };

        for(SmartDevice mySmart : smart){
            mySmart.activate();
            System.out.println();
        }
    }  
}
