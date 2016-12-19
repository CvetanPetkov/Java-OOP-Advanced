package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.ISpecialisedSoldier;

public class SpecialisedSoldier extends Private implements ISpecialisedSoldier {

    private String corps;

    public SpecialisedSoldier(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
            this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\n" +
        "Corps: %s" + "\n", getCorps());
    }
}
