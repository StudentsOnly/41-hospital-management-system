import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public boolean addPatient(Patient patient) {
        if (getPatient(patient.getPatientId()) == null)
        {
            return patients.add(patient);
        }
        return false;
    }

    public Patient getPatient(String id) {
        for (var p : patients) {
            if (p.getPatientId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean addDoctor(Doctor doctor) {
        if (getDoctor(doctor.getDoctorId()) == null)
        {
            return doctors.add(doctor);
        }
        return false;
    }

    public Doctor getDoctor(String id) {
        for (var d : doctors) {
            if (d.getDoctorId().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public boolean addAppointment(Appointment appointment) {
        return appointments.add(appointment);
    }

    public Appointment getAppointment(String id) {
        for (var a : appointments) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public void displayPatient(String id) {
        System.out.println(getPatient(id));
    }

    public void displayDoctor(String id) {
        System.out.println(getDoctor(id));
    }

    public void displayAppointment(String id) {
        System.out.println(getAppointment(id));
    }

    public void displayPatients() {
        System.out.println();
        System.out.println("Patients");
        System.out.println("------------");
        patients.forEach(System.out::println);
        System.out.println();
    }

    public void displayDoctors() {
        System.out.println();
        System.out.println("Doctors");
        System.out.println("------------");
        doctors.forEach(System.out::println);
        System.out.println();
    }

    public void displayAppointments() {
        System.out.println();
        System.out.println("Appointments");
        System.out.println("------------");
        appointments.forEach(System.out::println);
        System.out.println();
    }
}
