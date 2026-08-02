import java.util.*;

class Address{
    private String street;
    private String city;
    private int pincode;

    public Address(String street, String city, int pincode){
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public String getStreet(){return street;}
    public String getCity(){return city;}
    public int getPincode(){return pincode;}

    public String getFullAddress(){
        return street + ", " + city + " - " + pincode;
    }
}

class Student{
    private String name;
    private int age;
    private Address address;

    public Student(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String displayDetails(){
        return "Student: " + name + "\n"+
            "Age: " + age +"\n"+
            "Address: " + address.getFullAddress();
    }
}

public class StudentAddress {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String studentStreet = scan.nextLine();
        String studentCity = scan.nextLine();
        int pincode = scan.nextInt();

        Address address = new Address(studentStreet, studentCity, pincode);
        Student student = new Student(name, age, address);

        System.out.println(student.displayDetails());
        scan.close();
    }    
}
