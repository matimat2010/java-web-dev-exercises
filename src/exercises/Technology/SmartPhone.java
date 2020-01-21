package exercises.Technology;

public class SmartPhone extends Computer {
    private String model;

    public SmartPhone(String brand, String speed, int year, String model) {
        super(brand, speed, year);
        this.model = model;
    }

    public void makeCall() {
        System.out.println("Dialing");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
