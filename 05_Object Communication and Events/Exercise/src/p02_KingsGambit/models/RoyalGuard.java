package p02_KingsGambit.models;

import p02_KingsGambit.contracts.Unit;

public class RoyalGuard implements Unit{

    private String name;
    private static String TYPE_OF_UNIT = "Royal Guard";

    public RoyalGuard(String name) {
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
        return String.format("%s %s is defending!",
                this.getTypeOfUnit(), this.getName());
    }
}
