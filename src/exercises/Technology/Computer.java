package exercises.Technology;
//superclass//
public class Computer extends AbstractEntitiy{
    private String brand;
    private String speed;
    private int year;

public Computer (String brand, String speed, int year){
    this.brand = brand;
    this.speed = speed;
    this.year = year;
}

    //write 2 methods
public void brand() {
    System.out.println(brand);
}

public void speed() {
    System.out.println(speed);
}

    //getters and setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
        public String toString() {
            return "Computer" + "\n" +
                    "Brand: " +  brand  + "\n" +
                    "Speed: " + speed + "\n" +
                    "Year: " + year + "\n" +
                    "ID: " + AbstractEntitiy.newId();



    }
}
