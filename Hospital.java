import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Hospital {

    private Set<Patient> patients = new HashSet<>();
    private Set<Doctor> doctors = new HashSet<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Patient with ID " + patient.getPatientId() + " already exists.");
        } else {
            patients.add(patient);
            System.out.println("Patient added: " + patient.getPatientName());
        }
    }

    public void addDoctor(Doctor doctor) {
        if (doctors.contains(doctor)) {
            System.out.println("Doctor with ID " + doctor.getDoctorId() + " already exists.");
        } else {
            doctors.add(doctor);
            System.out.println("Doctor added: " + doctor.getDoctorName());
        }
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled for " + appointment.getPatient().getPatientName() + " with Dr. " + appointment.getDoctor().getDoctorName());
    }

    public void displayAllPatients() {
        System.out.println("\n--- Patients ---");
        for (Patient patient : patients) {
            patient.displayPatientInfo();
        }
    }

    public void displayBookingInformation() {
        for (Appointment appointment : appointments) {
            appointment.displayAppointmentDetails();
        }
    }
}
