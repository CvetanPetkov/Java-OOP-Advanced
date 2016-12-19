package p07_FoodShortage.models;

public class Citizen extends Person {

    private String id;
    private String birthdate;

    public Citizen(String name, String age, String id, String birthdate) {
        super(name, age);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    @Override
    public void buyFood() {
        this.foodBought += 10;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getFoodBought() {
        return this.foodBought;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private void setId(String id) {
        this.id = id;
    }

}
