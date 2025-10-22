import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Patient extends Person{
    private String patentId;
    private String bloodGroup;
    private List<String> allergies;
    private String emergencyContact;
    private LocalDate registrationDate;
    private String insuranceId;
    private List<String> medicalRecords;
    private List<String> appointments;
    static Scanner sc=new Scanner(System.in);
    public Patient(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("patentId= " + patentId +
                ", bloodGroup= " + bloodGroup +
                ", allergies=" + allergies +
                ", emergencyContact= " + emergencyContact +
                ", registrationDate= " + registrationDate +
                ", insuranceId= " + insuranceId +
                ", medicalRecords= " + medicalRecords +
                ", appointments= " + appointments);
    }
    public void addMedicalRecord(){
        System.out.println("please enter the medical record to insert it in list: ");
        medicalRecords.add(sc.nextLine());
    }
    public void addAppointment(){
        System.out.println("please enter the appointment to insert it in the list: ");
        medicalRecords.add(sc.nextLine());
    }
    public void updateInsurance(){
        System.out.println("please enter the new insurance to update it: ");
        insuranceId=sc.nextLine();
    }

}
