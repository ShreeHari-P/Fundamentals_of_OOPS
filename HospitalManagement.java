import java.util.*;

class Doctor{
    private String name;
    private String specialization;

    public Doctor(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public String getName(){return name;}
    public String getSpecialization(){return specialization;}

    public String toString(){
        return "Dr. " + name + " ("+specialization+")";
    }
}

class PatientRecord{
    private String patientName;
    private String disease;

    public PatientRecord(String patientName, String disease){
        this.patientName = patientName;
        this.disease = disease;
    }

    public String getPatientName(){return patientName;}
    public String getDisease(){return disease;}

    public String toString(){
        return "Patient: " + patientName + " (" + disease + ")";
    }
}

class Hospital{
    private String hospitalName;
    private Doctor doctor;
    private PatientRecord[] patientRecords;

    public Hospital(String hospitalName, Doctor doctor, int numRecords){
        this.hospitalName = hospitalName;
        this.doctor = doctor;
        this.patientRecords = new PatientRecord[numRecords];

        for(int i = 0; i < numRecords; i++){
            this.patientRecords[i] = new PatientRecord("Patient "+(i+1), "General");
        }
    }

    public String getInfo(){
        return "Hospital: " + hospitalName +
                "\nDoctor: " + doctor.toString();
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < patientRecords.length; i++){
            result += patientRecords[i].toString() + "\n";
        }
        return result.trim();
    }
}

public class HospitalManagement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String doctorName = scan.nextLine();
        String specialization = scan.nextLine();
        String hospitalName = scan.nextLine();
        int records = scan.nextInt();

        Doctor doctor = new Doctor(doctorName, specialization);
        Hospital hospital = new Hospital(hospitalName, doctor, records);

        System.out.println(hospital.getInfo());
        System.out.println();
        System.out.println(hospital.toString());
    }
}
