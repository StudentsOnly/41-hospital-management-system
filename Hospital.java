import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    // Constructor
    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    // Add a new patient
    public void addPatient(Patient patient) {
        // Ensure patient ID is unique
        for (Patient p : patients) {
            if (p.getPatientId().equals(patient.getPatientId())) {
                System.out.println("Error: Patient ID must be unique.");
                return;
            }
        }
        patients.add(patient);
        System.out.println("Patient added: " + patient.getPatientName());
    }

    // Add a new doctor
    public void addDoctor(Doctor doctor) {
        // Ensure doctor ID is unique
        for (Doctor d : doctors) {
            if (d.getDoctorId().equals(doctor.getDoctorId())) {
                System.out.println("Error: Doctor ID must be unique.");
                return;
            }
        }
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor.getDoctorName());
    }

    // Schedule an appointment
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled on " + appointment.getDate() + " at " + appointment.getTime());
    }

    // Display all patients
    public void displayPatients() {
        System.out.println("Patient List:");
        for (Patient p : patients) {
            p.displayInfo();
            System.out.println();
        }
    }

    // Display all doctors
    public void displayDoctors() {
        System.out.println("Doctor List:");
        for (Doctor d : doctors) {
            d.displayInfo();
            System.out.println();
        }
    }

    // Display all appointments
    public void displayAppointments() {
        System.out.println("Appointments List:");
        for (Appointment a : appointments) {
            a.displayInfo();
            System.out.println();
        }
    }
}
