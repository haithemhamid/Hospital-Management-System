import java.time.LocalDate;

public class MedicalRecord {
    private String recordId;
    private String patientId;
    private String doctorId;
    private LocalDate visitDate;
    private String diagnosis;
    private String prescription;
    private String testResults;
    private String notes;

    public MedicalRecord(String recordId, String notes, String testResults, String prescription, LocalDate visitDate, String diagnosis, String doctorId, String patientId) {
        this.recordId = recordId;
        this.notes = notes;
        this.testResults = testResults;
        this.prescription = prescription;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +

                '}';
    }

    public void displayInfo() {
        System.out.println(
                "recordId= " + recordId +
                        ", patientId= " + patientId +
                        ", doctorId= " + doctorId +
                        ", visitDate= " + visitDate +
                        ", diagnosis= " + diagnosis +
                        ", prescription= " + prescription +
                        ", testResults= " + testResults +
                        ", notes=" + notes
        );
    }

}
