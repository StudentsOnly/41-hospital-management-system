public class Patient {
    private String patientId;
    private String patientName;
    private String dateOfBirth;

    // Constructor
    public Patient(String patientId, String patientName, String dateOfBirth) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and Setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Display patient information
    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}