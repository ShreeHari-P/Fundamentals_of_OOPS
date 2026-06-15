public class Main{
    public static void main(String[] args){
        
        EmpManagement[] emp = {
            new Developer(),
            new Tester()
        };

        for(EmpManagement myEmp : emp){
            myEmp.work();

            if(myEmp instanceof Developer dev){
                dev.writeCode();
                System.out.println();
            }else if(myEmp instanceof Tester test){
                test.testSoftware();
            }
        }
    }
}