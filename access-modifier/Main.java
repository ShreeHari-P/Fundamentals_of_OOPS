public class Main{
    public static void main(String[] args){
        
        Employee emp = new Employee(101, "IT", "John", "Google");

        System.out.println("From Main class, Private is not accessible");
        System.out.println("Name: " + emp.name);
        System.out.println("Department: " + emp.department);
        System.out.println("Company: " + emp.company);

        System.out.println("------------------------------------");
        emp.display();
    }
}