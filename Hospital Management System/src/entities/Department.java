package entities;
import java.util.List;

public class Department {
    private String departmentId;
    private String departmentName;
    private String headDoctorId;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private Integer bedCapacity;
    private Integer availableBeds;

    public Department(String departmentId, Integer availableBeds, Integer bedCapacity, List<Doctor> doctors, List<Nurse> nurses, String headDoctorId, String departmentName) {
        this.departmentId = departmentId;
        this.availableBeds = availableBeds;
        this.bedCapacity = bedCapacity;
        this.doctors = doctors;
        this.nurses = nurses;
        this.headDoctorId = headDoctorId;
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHeadDoctorId() {
        return headDoctorId;
    }

    public void setHeadDoctorId(String headDoctorId) {
        this.headDoctorId = headDoctorId;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public Integer getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(Integer bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    public Integer getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(Integer availableBeds) {
        this.availableBeds = availableBeds;
    }
    public void displayInfo(){
        System.out.println(
                "departmentId= " + departmentId  +
                        ", departmentName= " + departmentName +
                        ", headDoctorId= " + headDoctorId  +
                        ", doctors= " + doctors +
                        ", nurses= " + nurses +
                        ", bedCapacity= " + bedCapacity +
                        ", availableBeds= " + availableBeds
        );
    }

public void assignDoctor(){

}
public void assignNurse(){

}
public void updateBedAvailability(){

}
}
