import java.util.Scanner;

public class Student implements Cloneable{
    private String studentId;
    private String name;
    private double marks;

    public Student(String studentId, String name, double marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public String getStudentId(){return studentId;}
    public String getName(){return name;}
    public double getMarks(){return marks;}

    public void setMarks(double marks){
        this.marks = marks;
    }

    @Override
    public Student clone(){
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return "Student[id=" + studentId + ", name=" + name +", marks=" + marks +"]";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String studentId = scan.nextLine();
        String name = scan.nextLine();
        double marks = scan.nextDouble();

        Student originalStudent = new Student(studentId, name, marks);
        Student copyStudent = originalStudent.clone();

        copyStudent.setMarks(marks+5);

        //Automatically calls toString()
        System.out.println("Original: " + originalStudent);
        System.out.println("Clone: " + copyStudent);
        System.out.println("Independent: " + (originalStudent != copyStudent));
    }
}


