import java.util.*;

sealed abstract class Employee permits Manager, Developer, Tester{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract String displayRole();
}

final class Manager extends Employee{
    public Manager(String name){
        super(name);
    }

    @Override
    public String displayRole(){
        return "Manager: " + getName();
    }
}

non-sealed class Developer extends Employee{
    public Developer(String name){
        super(name);
    }

    @Override
    public String displayRole(){
        return "Developer: " + getName();
    }
}

final class Tester extends Employee{
    public Tester(String name){
        super(name);
    }

    @Override
    public String displayRole(){
        return "Tester: " + getName();
    }
}

public class EmployeeRoles{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String managerName = scan.nextLine();
        String developerName = scan.nextLine();
        String testerName = scan.nextLine();

        Employee[] employee = {
            new Manager(managerName),
            new Developer(developerName),
            new Tester(testerName)
        };

        for(Employee emp : employee){
            System.out.println(emp.displayRole());
        }
    }
}