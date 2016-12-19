package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.IRepair;

public class Repair implements IRepair {

    private String partName;
    private Integer hoursWorked;

    public Repair(String partName, Integer hoursWorked) {
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public Integer getHoursWorked() {
        return this.hoursWorked;
    }
}
