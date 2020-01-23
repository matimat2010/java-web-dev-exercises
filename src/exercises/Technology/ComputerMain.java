package exercises.Technology;

public class ComputerMain {
    public static void main(String[] args) {


    Computer Mac = new Computer("Apple","Fast",2020 );
    System.out.println(Mac.toString());

 System.out.println("\n" + "* * * * * * * *" + "\n");

    Laptop MacBook = new Laptop("Apple Pro", "Super Fast", 2021,15.5);
        System.out.println(MacBook.toString());
       // System.out.println(MacBook.getId());
        System.out.println("Connect To Screen Method: ");
        MacBook.connectToScreen();
        System.out.println("\n" + "* * * * * * * *" + "\n");
       // Computer (String brand, String speed, int year)

        SmartPhone Iphone = new SmartPhone("Iphone", "Even Faster", 2022, "10x");
        System.out.println(Iphone.toString());
        System.out.println("Make A Phone Call Method: ");
        Iphone.makeCall();




    }


}
//    public Laptop(String brand, String speed, int year) {
//        super(brand, speed, year);
//        this.size = size;