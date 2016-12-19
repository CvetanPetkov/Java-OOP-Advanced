package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.IPrivate;

public class Private extends Soldier implements IPrivate {

    private Double salary;

    public Private(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    private void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String getId() {
        return super.getID();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Salary: %.2f",
                this.getSalary());
    }
}
