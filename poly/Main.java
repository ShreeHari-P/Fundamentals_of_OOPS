public class Main{
    public static void main(String[] args){
        
        Employee emp = new Developer();
        emp.work();

        Developer dev = (Developer) emp;
        dev.work();
        dev.writeCode();
    
        System.out.println();

        Employee emp1 = new Tester();
        emp1.work();

        Tester test = (Tester) emp1;
        test.work();
        test.testSoftware();
        
    }
}