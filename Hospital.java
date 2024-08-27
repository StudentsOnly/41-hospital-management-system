import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public boolean addPatient(Patient patient) {
        if (patients.isEmpty()) return patients.add(patient);
        for (var patientInList : patients) {
            if (patientInList.getId().equals(patient.getId())) {
                return false;
            }
        }
        return patients.add(patient);
    }

    public boolean addDoctor(Doctor doctor) {
        if (doctors.isEmpty()) return doctors.add(doctor);
        for (var doctorInList : doctors) {
            if (doctorInList.getId().equals(doctor.getId())) {
                return false;
            }
        }
        return doctors.add(doctor);
    }

    /**
     * This method doesn't allow creating 2 appointments at the same time, ideally it should check doctors and patient availability by date and time (but I'm lazy)
     */
    public boolean scheduleAppointment(String doctorsName, String patientName, String date, String time) {
        if (getDoctorByName(doctorsName) == null) {
            System.err.println("No such doctor");
            return false;
        }
        if (getPatientByName(patientName) == null) {
            System.err.println("No such patient");
            return false;
        }

        Appointment appointment = new Appointment(getPatientByName(patientName), getDoctorByName(doctorsName), date, time);
        if (appointments.isEmpty()) return appointments.add(appointment);

        for (var appointmentInList : appointments) {
            if (appointmentInList.getDate().equals(appointment.getDate()) && appointmentInList.getTime().equals(appointment.getTime())) {
                return false;
            }
        }
        return appointments.add(appointment);
    }

    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.err.println("No doctors");
            return;
        }
        System.out.println("All doctors: ");
        for (var doctor : doctors) {
            System.out.println("\t" + doctor);
        }
    }

    public void displayPatients() {
        if (patients.isEmpty()) {
            System.err.println("No patients");
            return;
        }
        System.out.println("All patients: ");
        for (var patient : patients) {
            System.out.println("\t" + patient);
        }
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.err.println("No appointments");
            return;
        }
        System.out.println("All appointments: ");
        for (var appointment : appointments) {
            System.out.println("\t" + appointment);
        }
    }

    private Doctor getDoctorByName(String name) {
        if (!name.matches("[a-zA-Z]{2,} [a-zA-Z]{2,}")) return null;
        for (var doctor : doctors) {
            if (doctor.getName().equals(name.toUpperCase())) return doctor;
        }
        return null;
    }

    private Patient getPatientByName(String name) {
        if (!name.matches("[a-zA-Z]{2,} [a-zA-Z]{2,}")) return null;
        for (var patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) return patient;
        }
        return null;
    }
}
