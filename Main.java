public class Main{
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.displayDoctors();
        hospital.displayPatients();
        hospital.displayAppointments();

        Doctor cardiolog1 = new Doctor("1112", "Aign Sabine", "cardiologist");
        Doctor dermatolog1 = new Doctor("1112", "Wolf Marco", "dermatologist");
        Doctor dermatolog2 = new Doctor("1212", "Wolf Marco", "dermatologist");
        Doctor dermatolog3 = new Doctor("1213", "Aign Sabine", "dermatologist");
        Doctor endocrinolog1 = new Doctor("1311", "Smith John", "endocrinologist");

        hospital.addDoctor(cardiolog1);
        hospital.addDoctor(dermatolog1);
        hospital.addDoctor(dermatolog2);
        hospital.addDoctor(dermatolog3);
        hospital.addDoctor(endocrinolog1);

        Patient patient1 = new Patient("20", "Barbara Williams", "20.04.1977");
        Patient patient2 = new Patient("21", "Janifer Williams", "01.02.1989");
        Patient patient3 = new Patient("22", "Tobias Lin", "29.01.2001");
        Patient patient4 = new Patient("23", "Nicole Grand", "01.02.1989");
        Patient patient5 = new Patient("20", "Barbara Wolf", "25.05.1977");


        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);

        Appointment appointment1 = new Appointment(patient1, dermatolog2, "20.09.2024", "14:30");
        Appointment appointment2 = new Appointment(patient4, cardiolog1, "14.10.2024","12:00");
        Appointment appointment3 = new Appointment(patient1, dermatolog2, "15.10.2024", "08:25");
        Appointment appointment4 = new Appointment(patient2, cardiolog1, "14.10.24", "10:15");
        Appointment appointment5 = appointment1;


        hospital.schedulingAppointment(appointment1);
        hospital.schedulingAppointment(appointment2);
        hospital.schedulingAppointment(appointment3);
        hospital.schedulingAppointment(appointment4);
        hospital.schedulingAppointment(appointment5);
       

       hospital.displayAppointments();

        hospital.displayPatients();
        hospital.displayDoctors();

    }

}
