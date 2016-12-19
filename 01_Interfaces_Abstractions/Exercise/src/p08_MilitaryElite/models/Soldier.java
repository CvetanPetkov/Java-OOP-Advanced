package p08_MilitaryElite.models;

public class Soldier implements p08_MilitaryElite.interfaces.ISoldier {

    private String id;
    private String firstName;
    private String lastName;

    public Soldier(String id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s",
                this.getFirstName(), this.getLastName(), this.getID());
    }
}
