import java.util.*;

class School{
    private String schoolName;

    public School(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName(){return schoolName;}

    public String schooling(){
        return "School: " + schoolName;
    }
}

class ClassRoom{
    private String roomNo;
    private String teacher;

    public ClassRoom(String roomNo, String teacher){
        this.roomNo = roomNo;
        this.teacher = teacher;
    }

    public String RoomNo(){return roomNo;}
    public String getTeacher(){return teacher;}

    public String teaching(){
        return "Class: " + roomNo + 
                "\nTeacher: " + teacher;
    }
}

class Student{
    private String name;
    private ClassRoom classroom;
    private School school;

    public Student(String name, ClassRoom classroom, School school){
        this.name = name;
        this.classroom = classroom;
        this.school = school;
    }

    public String School(){
        return school.schooling() + "\n" +
                classroom.teaching() + "\n" +
                "Student: " + name;
    }
}

public class SchoolStudent {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String schoolName = scan.nextLine();
        String roomNo = scan.nextLine();
        String teacher = scan.nextLine();
        String studentName = scan.nextLine();

        School school = new School(schoolName);
        ClassRoom classRoom = new ClassRoom(roomNo, teacher);
        Student student = new Student(studentName, classRoom, school);

        System.out.println(student.School());
        scan.close();
    }   
}
