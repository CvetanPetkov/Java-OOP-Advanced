package p01_EventImplementation;

import java.util.EventObject;

public class NameChange extends EventObject{

    private String changedName;

    public NameChange(Object source, String changedName) {
        super(source);
        this.setChangedName(changedName);
    }

    private void setChangedName(String changedName) {
        this.changedName = changedName;
    }

    public String getChangedName() {
        return this.changedName;
    }
}
