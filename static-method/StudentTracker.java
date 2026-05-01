public class StudentTracker{
    private String name;
    private double marks;

    private static int totalStudents;
    private static double totalMarks;

    public StudentTracker(String name, double marks){
        this.name = name;
        this.marks = marks;
        totalStudents++;
        totalMarks += marks;
    }

    public static double getAverageMarks(){
        return totalMarks / totalStudents;
    }

    public static int getTotalStudents(){
        return totalStudents;
    }

    public void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Mark: " + marks);
    }
}
