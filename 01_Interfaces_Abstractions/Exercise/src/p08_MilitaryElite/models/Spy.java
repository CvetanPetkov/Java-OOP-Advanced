package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.ISpy;

public class Spy extends Soldier implements ISpy {

    private String codeNumber;

    public Spy(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCode Number: %s",
                this.getCodeNumber());
    }
}
