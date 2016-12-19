package p07_FoodShortage.models;

import p07_FoodShortage.interfaces.Buyer;

public abstract class Person implements Buyer{

    private String name;
    private String age;
    protected Integer foodBought;

    protected Person(String name, String age) {
        this.setName(name);
        this.setAge(age);
        this.foodBought = 0;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

}
