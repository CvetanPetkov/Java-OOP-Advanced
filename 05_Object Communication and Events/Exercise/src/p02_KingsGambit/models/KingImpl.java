package p02_KingsGambit.models;

import p02_KingsGambit.contracts.King;
import p02_KingsGambit.contracts.Unit;

import java.util.ArrayList;
import java.util.List;

public class KingImpl implements King{

    private String name;
    List<Unit> units;

    public KingImpl(String name) {
        this.setName(name);
        this.units = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addUnit(Unit unit) {
        units.add(unit);
    }

    @Override
    public void killUnit(String unitToKill) {
        for (Unit unit : units) {
            if (unitToKill.equals(unit.getName())) {
                units.remove(unit);
                break;
            }
        }
    }

    @Override
    public void attackKing() {
        System.out.printf("King %s is under attack!\n", this.getName());
        for (Unit unit : units) {
            System.out.println(unit.attackUnit());
        }
    }
}
