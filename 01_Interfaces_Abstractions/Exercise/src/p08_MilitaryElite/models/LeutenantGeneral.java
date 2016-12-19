package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.ILeutenantGeneral;
import p08_MilitaryElite.interfaces.IPrivate;

import java.util.ArrayList;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {

    private ArrayList<IPrivate> privatesList;

    public LeutenantGeneral(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary);
        this.privatesList = new ArrayList<>();
    }

    @Override
    public void addPrivatesList(IPrivate privateSoldier) {
        this.privatesList.add(privateSoldier);
    }

    @Override
    public String getPrivates() {
        String info = "";
        for (IPrivate currPrivate : privatesList) {
            info += "\n  " + currPrivate.toString();
        }
        return info;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n" +
                "Privates:%s", this.getPrivates());
    }
}
