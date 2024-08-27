public final class Patient extends Person {
    private String dateOfBirth;

    public Patient(String patientID, String patientName, String dateOfBirth) {
        this.setId(patientID);
        this.setName(patientName);
        this.setDateOfBirth(dateOfBirth);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth date of birth in format dd.mm.yyyy
     * @return true if dateOfBirth has been set, otherwise returns false
     */
    private boolean setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth.matches("[0-3][0-9].[0-1][0-9].[0-9]{4}")) {
            this.dateOfBirth = dateOfBirth;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return this.getName() + ", id: " + this.getId() + ", Date of Birth: " + this.getDateOfBirth();
    }
}
