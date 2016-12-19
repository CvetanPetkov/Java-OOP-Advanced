package p06_BirthdayCelebrations.models;

import p06_BirthdayCelebrations.interfaces.IBirthdate;

public class Pet implements IBirthdate{

    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.setName(name);
        this.setBirthdate(birthdate);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getBirthdate() {
        return birthdate;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public void iBirthdate(String year) {
        String[] dates = getBirthdate().split("/");
        String currYear = dates[2];
        if (currYear.equals(year)) {
            System.out.println(getBirthdate());
        }
    }
}
