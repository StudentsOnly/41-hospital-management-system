import java.util.ArrayList;

public class Hospital {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public Hospital(){
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient){
        if(!patients.isEmpty() && patients.contains(patient)){
            System.out.println("-- Patient with ID " + patient.getPatientID() + " is already in the system");
        }else{
            patients.add(patient);
            System.out.println("++ Patient with ID " + patient.getPatientID() + " was registered");
        }
    }

    public void addDoctor(Doctor doctor){
        if(!doctors.isEmpty()  && doctors.contains(doctor)){
            System.out.println("-- Doctor with ID " + doctor.getDoctorID() + " is already in the system");
        }else{
            doctors.add(doctor);
            System.out.println("++ Doctor with ID " + doctor.getDoctorID() + " was registered");
        }
    }

    public void schedulingAppointment(Appointment appointment){

        if(appointments.contains(appointment)){
            System.out.println("-- This appointment was already scheduled");
        }else{
            appointments.add(appointment);
            System.out.println("++ Appointment for '" + appointment.getPatient().getPatientName() + "' was scheduled with doctor '" + appointment.getDoctor().getDoctorName() + "'");
        }

    }

    public void displayPatients(){
        System.out.print("\n=== Patients ===");
        if(patients.isEmpty()){
            System.out.println("\n--");
        }else {
            for (Patient patient : patients) {
                patient.displayPatientInfo();
            }
        }
    }

    public void displayDoctors(){
        System.out.print("\n=== Doctors ===");
        if(!doctors.isEmpty()) {
            for (Doctor doctor : doctors) {
                doctor.displayDoctorInfo();
            }
        }else{
            System.out.println("\n--");
        }
        }

        public void displayAppointments(){
            System.out.print("\n====Appointments====");
            if(!appointments.isEmpty()) {
                for (Appointment app : appointments) {
                    app.displayAppointmentInfo();
                }
            }else{
                System.out.println("\n--");
            }
        }

}
