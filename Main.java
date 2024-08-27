public class Main{

    public static void main(String[] args) {

        Hospital h = new Hospital();

        h.addDoctor(new Doctor("12345","Rolf Weber", "General"));
        h.addDoctor(new Doctor("23456","Alf Rot", "Veterinarian"));
        h.addDoctor(new Doctor("34566","John Doe", "Urology"));

        h.addPatient(new Patient("12345","Patient 1", "1987"));
        h.addPatient(new Patient("23456","Patient 2", "2004"));
        h.addPatient(new Patient("34566","Patient 3", "1864"));

        // try duplicate entry
        h.addPatient(new Patient("34566","Patient 3", "1864"));

        h.addAppointment(new Appointment("12345", h.getPatient("12345"), h.getDoctor("12345"),
                "2024-08-12", "15:33"));
        h.addAppointment(new Appointment("12345", h.getPatient("23456"), h.getDoctor("23456"),
                "2024-10-24", "8:23"));
        h.addAppointment(new Appointment("12345", h.getPatient("34566"), h.getDoctor("34566"),
                "2024-09-02", "17:11"));

        h.displayPatients();
        h.displayDoctors();
        h.displayAppointments();
    }
}
