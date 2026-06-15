class EmpManagement{
    public void work(){
        System.out.println("Employee Works");
    }
}

class Developer extends EmpManagement{
    @Override
    public void work(){
        System.out.println("Developer Works...");
    }

    public void writeCode(){
        System.out.println("Developer writes code");
    }
}

class Tester extends EmpManagement{
    @Override
    public void work(){
        System.out.println("Tester Works...");
    }

    public void testSoftware(){
        System.out.println("Tester tests code");
    }
}
