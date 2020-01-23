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

    @Override
    public String toString() {
        return "Laptop" + "\n" +
                "Brand: " +  this.getBrand() + "\n" +
                "Speed: " + this.getSpeed() + "\n" +
                "Year: " + this.getYear() + "\n" +
                "Size: " + this.getSize() + "\n" +
                "ID: " + AbstractEntitiy.newId();

    }
}
