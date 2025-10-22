import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Doctor extends Person{
    private String doctorId;
    private String specialization;
    private String qualification;
    private Integer experienceYears;
    private String departmentId;
    private Double consultationFee;
    private List<String> availableSlots;
    private List<Patient> assignedPatients;
    static Scanner sc=new Scanner(System.in);
    public Doctor(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
    }



    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(
                "doctorId= " + doctorId +
                        ", specialization= " + specialization +
                        ", qualification= " + qualification+
                        ", experienceYears= " + experienceYears +
                        ", departmentId= " + departmentId+
                        ", consultationFee= " + consultationFee +
                        ", availableSlots= " + availableSlots +
                        ", assignedPatients= " + assignedPatients
        );
    }
    public void assignPatient(){
        System.out.println("please enter the patient to insert it in list: ");

    }
    public void removePatient(){
        assignedPatients.remove(departmentId);
    }
    public void updateAvailability(){
        
    }

}
