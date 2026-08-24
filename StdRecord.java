import java.util.*;

record Student(String name, int age, double cgpa){

    public String getGrade(){
        if(cgpa >= 9){
            return "A+";
        }else if(cgpa >= 8){
            return "A";
        }else if(cgpa >= 7){
            return "B";
        }else{
            return "C";
        }
    }

    public String printDetails(){
        return "Name: " + name() +
                "\nAge: " + age() +
                "\nCGPA: " + cgpa() +
                "\nGrade: " + getGrade();
     }
}

public class StdRecord{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double cgpa = Double.parseDouble(scan.nextLine());

        Student std = new Student(name, age, cgpa);
        System.out.println(std.printDetails());
    }
}