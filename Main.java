public class Main {
    public static void main(String[] args) {
        Hospital hospitalMNG = new Hospital();

        // Adding Patients
        Patient patient1 = new Patient("P001", "Shaggy Rogers", "1972-07-26");
        Patient patient2 = new Patient("P002", "Mary Smith", "1960-09-30");
        Patient patient3 = new Patient("P002", "Fred Flintstone", "1960-09-30");
        hospitalMNG.addPatient(patient1);
        hospitalMNG.addPatient(patient2);
        hospitalMNG.addPatient(patient3);

        // Adding Doctors
        Doctor doctor1 = new Doctor("D001", "Dr. Benton Quest", "Neurology");
        Doctor doctor2 = new Doctor("D002", "Dr. Julius Hibbert", "General Medicine");
        hospitalMNG.addDoctor(doctor1);
        hospitalMNG.addDoctor(doctor2);

        // Schedule appointments
        Appointment appointment1 = new Appointment(patient1, doctor1, "2024-08-20", "10:00 AM");
        Appointment appointment2 = new Appointment(patient2, doctor2, "2024-08-21", "11:00 AM");
        hospitalMNG.scheduleAppointment(appointment1);
        hospitalMNG.scheduleAppointment(appointment2);

        // Display information


        hospitalMNG.displayBookingInformation();
    }
}