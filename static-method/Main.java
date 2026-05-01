import java.util.Scanner;

public class Main{

   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String student1 = scan.nextLine();
        double marks1 = Double.parseDouble(scan.nextLine());
        String student2 = scan.nextLine();
        double marks2 = Double.parseDouble(scan.nextLine());
        String student3 = scan.nextLine();
        double marks3 = Double.parseDouble(scan.nextLine());

        StudentTracker stud1 = new StudentTracker(student1, marks1);
        StudentTracker stud2 = new StudentTracker(student2, marks2);
        StudentTracker stud3 = new StudentTracker(student3, marks3);

        double avgMark1 = StudentTracker.getAverageMarks();

        stud1.display();
        stud2.display();
        stud3.display();
        System.out.println("TotalStudents: " + StudentTracker.getTotalStudents());
        System.out.printf("Average Mark: %.2f\n",avgMark1);

   }
}