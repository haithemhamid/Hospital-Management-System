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
    static Scanner sc = new Scanner(System.in);
    public Doctor(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
    }


    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(Double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<String> availableSlots) {
        this.availableSlots = availableSlots;
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
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
        int patientId=sc.nextInt();


    }
    public void removePatient(){
        assignedPatients.remove(departmentId);
    }
    public void updateAvailability(){
        
    }

}
