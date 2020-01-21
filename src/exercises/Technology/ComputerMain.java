package exercises.Technology;

public class ComputerMain {
    public static void main(String[] args) {


    Computer Mac = new Computer("Apple","Fast",2020 );
    System.out.println(Mac.toString());
    Mac.newId();
    System.out.println(Mac.getId());

    Laptop MacBook = new Laptop("Apple Pro", "Super Fast", 2021,15.5);
        System.out.println(MacBook.toString());
        MacBook.newId();
        System.out.println(MacBook.getId());
        MacBook.connectToScreen();
        System.out.println(MacBook.getSize());
       // Computer (String brand, String speed, int year)

        SmartPhone Iphone = new SmartPhone("Iphone", "Even Faster", 2022, "10x");
        System.out.println(Iphone.toString());
        Iphone.newId();
        System.out.println(Iphone.getId());
        Iphone.makeCall();
        System.out.println(Iphone.getModel());



    }


}
//    public Laptop(String brand, String speed, int year) {
//        super(brand, speed, year);
//        this.size = size;