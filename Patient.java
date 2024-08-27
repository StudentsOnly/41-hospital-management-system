import java.util.Objects;

public class Patient {

    private String patientID;
    private String patientName;
    private String dateOfBirth;


    public Patient(String patientID, String patientName, String dateOfBirth){
        this.patientID = patientID;
        this.patientName = patientName;
        this.dateOfBirth = dateOfBirth;
    }


    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(patientID, patient.patientID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patientID);
    }

    public void displayPatientInfo(){
        System.out.println("\nPatient:");
        System.out.println("\tID: " + patientID);
        System.out.println("\tName: " + patientName);
        System.out.println("\tDate of birth: " + dateOfBirth);
    }
}
