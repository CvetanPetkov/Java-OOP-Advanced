package pr02MultipleImplementation;

import pr02MultipleImplementation.interfaces.Birthable;
import pr02MultipleImplementation.interfaces.Identifiable;
import pr02MultipleImplementation.interfaces.Person;

public class Citizen implements Person, Birthable, Identifiable {

    private String name;
    private Integer age;
    private String id;
    private String birthdate;

    public Citizen(String name, Integer age, String id, String birthdate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private void setName(String name) {
        this.name = name;
    }


    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String Birthdate() {
        return this.birthdate;
    }

    @Override
    public String Id() {
        return this.id;
    }

}
