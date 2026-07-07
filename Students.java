import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Stud implements Comparable<Stud>{
    String name;
    int marks;

    public Stud(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Stud other){
    if (this.marks != other.marks) {
        return Integer.compare(other.marks, this.marks); // Higher marks first
    }
        return this.name.compareTo(other.name); // Alphabetical order
    }

    @Override
    public String toString(){
        return "Student[name=" + name + ", marks=" + marks +"]"; 
    }
}

public class Students{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Stud> myStud = new ArrayList<>();

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();

        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");

        myStud.add(new Stud(parts1[0], Integer.parseInt(parts1[1])));
        myStud.add(new Stud(parts2[0], Integer.parseInt(parts2[1])));
        myStud.add(new Stud(parts3[0], Integer.parseInt(parts3[1])));

        Collections.sort(myStud);
        
        for(Stud stud : myStud){
            System.out.println(stud);
        }
    }
}