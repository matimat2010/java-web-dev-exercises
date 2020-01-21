package exercises.Technology;

public class Laptop extends Computer {
    private double size;

    public Laptop(String brand, String speed, int year, double size) {
        super(brand, speed, year);
        this.size = size;
    }

    public void connectToScreen() {
        System.out.println("Connected!");
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
