class Employee {
    public void work(){
        System.out.println("Employee works...");
    }
}

class Developer extends Employee{
    @Override
    public void work() {
        System.out.println("Coding...");
    }

    public void writeCode(){
        System.out.println("Writes codes...");
    }
}

class Tester extends Employee{
    @Override
    public void work() {
        System.out.println("Testing...");
    }

    public void testSoftware(){
        System.out.println("Tests codes...");
    }
}
