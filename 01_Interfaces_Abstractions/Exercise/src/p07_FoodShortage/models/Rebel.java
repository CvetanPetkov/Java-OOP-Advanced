package p07_FoodShortage.models;

public class Rebel extends Person{

    private String group;

    public Rebel(String name, String age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void buyFood() {
        this.foodBought += 5;
    }

    @Override
    public Integer getFoodBought() {
        return this.foodBought;
    }

    private void setGroup(String group) {
        this.group = group;
    }

}
