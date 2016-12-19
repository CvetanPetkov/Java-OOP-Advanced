package p06_BirthdayCelebrations.models;

import p06_BirthdayCelebrations.interfaces.IBirthdate;

public class Citizen implements IBirthdate {

    private String name;
    private String age;
    private String id;
    private String birthdate;

    public Citizen(String name, String age, String id, String birthdate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
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
