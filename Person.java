public abstract class Person {
    private String name;
    private String id;

    public boolean setId(String personID) {
        if (personID.matches("[0-9]{7}")) {
            this.id = personID;
            return true;
        } else return false;
    }

    public String getId() {
        return id;
    }

    public boolean setName(String personName) {
        if (personName.matches("[a-zA-Z]{2,} [a-zA-Z]{2,}")) {
            this.name = personName.toUpperCase();
            return true;
        } else return false;
    }

    public String getName() {
        return this.name;
    }
}
