public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.addDoctor(new Doctor("1234567", "Emanuel Macron", "Digital privacy"));
        hospital.addDoctor(new Doctor("1234567", "John Smith", "ADHD")); // same id -> not added
        hospital.addDoctor(new Doctor("1234568", "Angela Merkel", "Music"));
        hospital.displayDoctors();

        hospital.addPatient(new Patient("1234567", "pavel DUROV", "10.10.1984"));
        hospital.addPatient(new Patient("1234567", "John Smith", "05.05.2000")); // same id -> not added
        hospital.addPatient(new Patient("1234568", "Olaf Scholz", "05.05.2000"));
        hospital.displayPatients();

        hospital.scheduleAppointment("EMANUEL MACRON", "Pavel Durov", "25.08.2024", "15:00");
        hospital.displayAppointments();
    }

}
