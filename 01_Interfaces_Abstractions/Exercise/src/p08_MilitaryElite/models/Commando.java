package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.ICommando;
import p08_MilitaryElite.interfaces.IMission;

import java.util.ArrayList;

public class Commando extends SpecialisedSoldier implements ICommando {

    ArrayList<IMission> missionsList;

    public Commando(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missionsList = new ArrayList<>();
    }

    @Override
    public void addMissionsList(IMission mission) {
        if (mission.getState().equals("inProgress")) {
            this.missionsList.add(mission);
        }
    }

    @Override
    public String getMission() {
        String info = "";
        for (IMission mission : missionsList) {
            info += String.format("\n  Code Name: %s State: %s",
                    mission.getCodeName(), mission.getState());
        }
        return info;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
        "Missions:%s", getMission());
    }
}
