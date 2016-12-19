package p05_BorderControl.models;

import p05_BorderControl.interfaces.Fakeable;

public class Robot implements Fakeable {

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }


    private void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public void isFake(String code) {
        if (getId().endsWith(code)) {
            System.out.println(String.format("%s", getId()));
        }
    }
}
