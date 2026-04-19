public class SimpleStudent {
    String name;
    int age;

    public static void main(String[] args){
        SimpleStudent student = new SimpleStudent();
        student.name = "Jennifer";
        student.age = 24;

        System.out.println("Name is " + student.name + " and Age is " + student.age);
    }
}
