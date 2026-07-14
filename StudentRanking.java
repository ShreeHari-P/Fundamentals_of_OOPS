import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Student{
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber(){return rollNumber;}
    public String getName(){return name;}
    public double getMarks(){return marks;}

    @Override
    public String toString(){
        return name + " (" + rollNumber + ") - " + marks;
    }
}

class MarksComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Double.compare(s2.getMarks(), s1.getMarks());
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

public class StudentRanking {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();

        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");

        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(Integer.parseInt(parts1[0]),parts1[1],Double.parseDouble(parts1[2])));
        student.add(new Student(Integer.parseInt(parts2[0]),parts2[1],Double.parseDouble(parts2[2])));
        student.add(new Student(Integer.parseInt(parts3[0]),parts3[1],Double.parseDouble(parts3[2])));

        System.out.println();
        System.out.println("Sorted By Marks:");
        Collections.sort(student, new MarksComparator());
        for(Student s : student){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Sorted By Name:");
        Collections.sort(student, new NameComparator());
        for(Student s : student){
            System.out.println(s);
        }
    }    
}
