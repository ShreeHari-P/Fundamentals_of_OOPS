import java.util.Scanner;
import java.util.Objects;
import java.util.HashMap;

class Patient{
    String patientId;
    String name;
    String age;
    String bloodGroup;

    public Patient(String patientId, String name, String age, String bloodGroup){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.bloodGroup= bloodGroup;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Patient patient = (Patient) obj;
        return Objects.equals(patientId, patient.patientId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(patientId);
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId='" + patientId + '\'' +
            ", name='" + name + '\'' + '}';
    }
}

public class HospitalPatient {
    public static void main(String[] args){

        HashMap<Patient, String> patient = new HashMap<>();

        Patient p1 = new Patient("P123", "Arun", "20", "AB+");
        Patient p2 = new Patient("P123", "Bala", "25", "O+");
        Patient p3 = new Patient("P456", "Catherine", "24", "A+");

        patient.put(p1,"Arthi");
        patient.put(p2, "Megavi");
        patient.put(p3, "Guna");

        System.out.println("Total unique patient: " + patient.size());
        for(Patient p : patient.keySet()){
            System.out.println(p.patientId + " -> " + patient.get(p));
        }
    }
}
