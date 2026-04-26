public class Employee{
    private int empId;
    String department;
    protected String name;
    public String company;

    public Employee(int empId, String department, String name, String company){
        this.empId = empId;
        this.department = department;
        this.name = name;
        this.company = company;
    }

    public void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Company: " + company);
    }
}
