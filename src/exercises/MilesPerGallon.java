package exercises;

import java.util.Scanner;



public class MilesPerGallon {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many miles have you driven? : ");
    int miles = input.nextInt();
    System.out.println("How many gallons of gas have you used? :");
    int gas = input.nextInt();

    int mpg = miles/gas;

    System.out.println("Your vehicle gets " + mpg + " miles per gallon.");

    }
}


