package p06_BirthdayCelebrations.models;

public class Robot {

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }


    private void setModel(String model) {
        this.model = model;
    }

    private String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

}
