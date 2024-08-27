public class Main {
    public static void main(String[] args) {
        // Create a Hospital instance
        Hospital hospital = new Hospital();

        Patient patient1 = new Patient("P001", "John Doe", "1990-01-01");
        Patient patient2 = new Patient("P002", "Jane Smith", "1985-05-05");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);


        Doctor doctor1 = new Doctor("D001", "Dr. Alice Johnson", "Cardiology");
        Doctor doctor2 = new Doctor("D002", "Dr. Bob Brown", "Neurology");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);


        Appointment appointment1 = new Appointment(patient1, doctor1, "2024-08-25", "10:00 AM");
        Appointment appointment2 = new Appointment(patient2, doctor2, "2024-08-26", "11:00 AM");
        hospital.scheduleAppointment(appointment1);
        hospital.scheduleAppointment(appointment2);


        System.out.println("\nDisplaying all patients:");
        hospital.displayPatients();

        System.out.println("Displaying all doctors:");
        hospital.displayDoctors();

        System.out.println("Displaying all appointments:");
        hospital.displayAppointments();
    }
}
