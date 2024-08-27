import java.util.Objects;

public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String date, String time){
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(patient, that.patient) && Objects.equals(doctor, that.doctor) && Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time, patient, doctor);
    }

    public void displayAppointmentInfo(){
        System.out.println("\nAppointment: \t" + date + ", time: " + time);
        System.out.println("\tPatient: " + this.getPatient().getPatientName() + ", Doctor: " + this.getDoctor().getDoctorName() + " (" + this.getDoctor().getSpecialization() + ")");

    }
}
