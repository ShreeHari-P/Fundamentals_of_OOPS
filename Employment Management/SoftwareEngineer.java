interface Workable{
    void work();
}

interface Trainable{
    void attendTraining();
}

interface Reportable{
    void submitReport();
}

abstract class Employee implements Workable, Trainable, Reportable{
    protected String name;

    public Employee(String name){
        this.name = name;
    }
}

class SoftwareEngineer extends Employee{
    public SoftwareEngineer(String name){
        super(name);
    }

    public void work(){
        System.out.println(name + " is coding");
    }

    public void attendTraining(){
        System.out.println(name + " attented training");
    }

    public void submitReport(){
        System.out.println(name + " submitted report");
    }
}
