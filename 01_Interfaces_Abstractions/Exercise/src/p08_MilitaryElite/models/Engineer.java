package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.IEngineer;
import p08_MilitaryElite.interfaces.IRepair;

import java.util.ArrayList;

public class Engineer extends SpecialisedSoldier implements IEngineer {

    private ArrayList<IRepair> repairsList;

    public Engineer(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairsList = new ArrayList<>();
    }

    @Override
    public void addRepairsList(IRepair repair) {
        this.repairsList.add(repair);
    }

    @Override
    public String getRepairs() {
        String info = "";
        for (IRepair repair : repairsList) {
            info += String.format("\n  Part Name: %s Hours Worked: %d",
                    repair.getPartName(), repair.getHoursWorked());
        }
        return info;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Repairs:%s",
                this.getRepairs());
    }
}
