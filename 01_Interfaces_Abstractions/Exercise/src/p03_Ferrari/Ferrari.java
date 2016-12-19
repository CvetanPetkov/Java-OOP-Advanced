package p03_Ferrari;

public class Ferrari implements Car{

    private String car;
    private String model;
    private String driver;

    Ferrari(String driver) {
        this.setCar();
        this.setModel();
        this.setDriver(driver);
    }

    private String getCar() {
        return car;
    }

    private void setCar() {
        this.car = "Ferrari";
    }

    private String getModel() {
        return model;
    }

    private void setModel() {
        this.model = "488-Spider";
    }

    private String getDriver() {
        return driver;
    }

    private void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String breaks() {
        return "Brakes!";
    }

    @Override
    public String pedals() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                this.getModel(), this.breaks(), this.pedals(), this.getDriver());
    }
}
