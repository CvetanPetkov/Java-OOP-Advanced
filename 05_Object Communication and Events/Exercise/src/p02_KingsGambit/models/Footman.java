package p02_KingsGambit.models;

import p02_KingsGambit.contracts.Unit;

public class Footman implements Unit{

    private String name;
    private static String TYPE_OF_UNIT = "Footman";

    public Footman(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getTypeOfUnit() {
        return TYPE_OF_UNIT;
    }

    @Override
    public String attackUnit() {
        return String.format("%s %s is panicking!",
                this.getTypeOfUnit(), this.getName());
    }
}
