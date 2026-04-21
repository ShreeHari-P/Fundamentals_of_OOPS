import java.util.Scanner;

public class Student {
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public boolean isPassed(){
        return (marks > 40);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name and Marks: ");
        String name = scan.nextLine();
        int age = scan.nextInt();

        Student s = new Student(name, age);
        System.out.println("The name of the student: " + s.getName());
        System.out.println("The Mark scored: " + s.getMarks());
        System.out.println("Is Passed the test: " + s.isPassed());
        scan.close();
    }
}
