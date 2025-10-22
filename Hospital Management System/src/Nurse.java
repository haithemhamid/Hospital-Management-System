import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Nurse extends Person {
    private String nurseId;
    private String departmentId;
    private Shift shift;
    private String qualification;
    private List<Patient> assignedPatients;
    static Scanner sc = new Scanner(System.in);

    public Nurse(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("nurseId= " + nurseId +
                ", departmentId= " + departmentId +
                ", shift= " + shift +
                ", qualification= " + qualification +
                ", assignedPatients= " + assignedPatients);
    }

    public void assignPatient() {
        System.out.println("please enter the patient to insert it in list: ");
        int patientId = sc.nextInt();
    }
}
