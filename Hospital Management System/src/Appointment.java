import java.time.LocalDate;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private Status status;
    private String reason;
    private String notes;

    public Appointment(String appointmentId, LocalDate appointmentDate, String patientId, String doctorId, String appointmentTime, Status status, String reason, String notes) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.reason = reason;
        this.notes = notes;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void displayInfo() {
        System.out.println(
                "appointmentId= " + appointmentId +
                        ", patientId= " + patientId +
                        ", doctorId= " + doctorId +
                        ", appointmentDate= " + appointmentDate +
                        ", appointmentTime= " + appointmentTime +
                        ", status= " + status +
                        ", reason= " + reason +
                        ", notes= " + notes
        );
    }

    public void reschedule() {

    }

    public void cancel() {

    }

    public void complete() {

    }
}
