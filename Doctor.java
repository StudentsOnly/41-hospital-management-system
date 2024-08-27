public class Doctor {
    private String doctorId;
    private String doctorName;
    private String specialization;

    // Constructor
    public Doctor(String doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Display doctor information
    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}
