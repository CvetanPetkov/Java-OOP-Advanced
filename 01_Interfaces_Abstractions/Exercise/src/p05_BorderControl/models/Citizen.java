package p05_BorderControl.models;

import p05_BorderControl.interfaces.Fakeable;

public class Citizen implements Fakeable {

    private String name;
    private String age;
    private String id;

    public Citizen(String name, String age, String id) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public void isFake(String code) {
        if (getId().endsWith(code)) {
            System.out.println(String.format("%s", getId()));
        }
    }
}
