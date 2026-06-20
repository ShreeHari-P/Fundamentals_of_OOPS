abstract class Employee{
    protected String name;
    protected int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

class Manager extends Employee{
    public Manager(String name, int salary){
        super(name, salary);
    }

    @Override
    void calculateBonus(){
        System.out.println(name + " bonus = " + salary);
    }
}

class Developer extends Employee{
    public Developer(String name, int salary){
        super(name, salary);
    }

    @Override
    void calculateBonus(){
        System.out.println(name + " bonus = " + salary);
    }
}

class Tester extends Employee{
    public Tester(String name, int salary){
        super(name, salary);
    }

    @Override
    void calculateBonus(){
        System.out.println(name + " bonus = " + salary);
    }
}
