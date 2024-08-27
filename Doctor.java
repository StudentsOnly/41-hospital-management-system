public class Doctor extends Person {
    private String specialization;

    public Doctor(String doctorID, String doctorName, String specialization) {
        this.setId(doctorID);
        this.setName(doctorName);
        this.setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return this.getName() + ", id: " + this.getId() + ", specialization: " + this.getSpecialization();
    }
}
