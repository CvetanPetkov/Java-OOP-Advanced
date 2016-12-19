package p08_MilitaryElite.models;

import p08_MilitaryElite.interfaces.IMission;

public class Mission implements IMission {

    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void setState(String state) {
        this.state = state;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void CompleteMission() {

    }
}
