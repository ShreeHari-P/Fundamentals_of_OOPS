import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNO, String name, int marks){
        this.rollNo = rollNO;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNO(){return rollNo;}
    public String getName(){return name;}
    public int getMarks(){return marks;}

    @Override
    public int compareTo(Student other){
        return Integer.compare(other.marks, this.marks);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNo == student.rollNo;
    }

    @Override
    public String toString(){
        return "Student["+rollNo+", "+name+", "+ marks+"]";
    }

    @Override
    public int hashCode(){
        return Objects.hash(rollNo);
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class RollNumberComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.getRollNO(), s2.getRollNO());
    }
}

public class StudentRecord {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();

        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");

        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student(Integer.parseInt(parts1[0].trim()), parts1[1].trim(), Integer.parseInt(parts1[2].trim())));
        student.add(new Student(Integer.parseInt(parts2[0].trim()), parts2[1].trim(), Integer.parseInt(parts2[2].trim())));
        student.add(new Student(Integer.parseInt(parts3[0].trim()), parts3[1].trim(), Integer.parseInt(parts3[2].trim())));

        Collections.sort(student);
        for(Student s : student){
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(student, new NameComparator());
        for(Student s : student){
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(student, new RollNumberComparator());
        for(Student s : student){
            System.out.println(s);
        }
    }    
}
