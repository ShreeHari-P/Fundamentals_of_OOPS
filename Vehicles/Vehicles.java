interface Vehicles{
    String start();
    String stop();
}

class Car implements Vehicles{
    public String start(){
        return "Car Started";
    }

    public String stop(){
        return "Car Stopped";
    }
}

class Bike implements Vehicles{
    public String start(){
        return "Bike Started";
    }

    public String stop(){
        return "Bike Stopped";
    }
}

class Bus implements Vehicles{
    public String start(){
        return "Bus Started";
    }

    public String stop(){
        return "Bus Stopped";
    }
}
