public class Appointment {

    protected Patient patient;
    protected Doctor doctor;
    String date;
    String time;

    public Appointment(Patient patient, Doctor doctor, String date, String time) {
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

    public void displayAppointmentDetails() {
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Doctor Name: " + doctor.getDoctorName());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println();
    }
}
