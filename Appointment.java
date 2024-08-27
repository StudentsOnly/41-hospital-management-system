public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.setDate(date);
        this.setTime(time);
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

    public boolean setDate(String date) {
        if (date.matches("[0-3][0-9].[0-1][0-9].[0-9]{4}")) {
            this.date = date;
            return true;
        } else return false;
    }

    public String getTime() {
        return time;
    }

    public boolean setTime(String time) {
        if (time.matches("[0-1][0-9]:[0-5][0-9]")) {
            this.time = time;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Date: " + this.getDate() + " Time: " + this.getTime() + ", Doctor: " + this.getDoctor().getName() + ", Patient: " + this.getPatient().getName();
    }
}
