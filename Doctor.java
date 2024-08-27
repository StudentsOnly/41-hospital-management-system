import java.util.Objects;

public class Doctor {

    private String doctorID;
    private String doctorName;
    private String specialization;

    public Doctor(String id, String name, String specialization){
        this.doctorID = id;
        this.doctorName = name;
        this.specialization = specialization;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(doctorID, doctor.doctorID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(doctorID);
    }

    public void displayDoctorInfo(){
        System.out.println("\nDoctor:");
        System.out.println("\tID: " + doctorID);
        System.out.println("\tName: " + doctorName);
        System.out.println("\tSpecialization: " + specialization);
    }
}
