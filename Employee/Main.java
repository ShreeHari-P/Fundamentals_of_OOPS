public class Main {

    public static void main(String[] args) {

        Employee[] employee = {
            new Manager("Manager", 10000),
            new Developer("Developer",5000),
            new Tester("Tester",3000)
        };

        for(Employee emp : employee){
            emp.calculateBonus();
        }
    }
}