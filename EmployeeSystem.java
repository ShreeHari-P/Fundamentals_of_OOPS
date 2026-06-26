abstract class Employee{
    int salary;

    public Employee(int salary){
        this.salary = salary;
    }

    public String getDetails(){
        return "Employee salary: " + salary;
    }

    abstract double calculateBonus();
}

interface Promotable{
    void promote();
    void demote();
}

class Manager extends Employee implements Promotable{
    String department;
    
    public Manager(String department, int salary){
        super(salary);
        this.department = department;
    }

    @Override
    double calculateBonus(){
        return salary * 0.20;
    }

    @Override
    public void promote(){
        System.out.println("Manger Promoted");
    }

    @Override
    public void demote(){
        System.out.println("Manager demoted");
    }
}

class Developer extends Employee{
    String programmingLanguage;

    public Developer(String programmingLanguage,int salary){
        super(salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    double calculateBonus(){
        return salary * 0.15;
    }
}

public class EmployeeSystem{
    public static void main(String[] args){

        Employee[] emp = {
            new Manager("HR", 20000),
            new Developer("Java", 15000)
        };

        for(Employee employee : emp){
            System.out.println(employee.getDetails());
            System.out.println(employee.calculateBonus());
        }

        if(emp[0] instanceof Manager){
        Manager manager = (Manager) emp[0];
        manager.promote();
        manager.demote();
        }
    }
}