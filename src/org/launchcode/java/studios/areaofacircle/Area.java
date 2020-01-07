package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    static Scanner rad = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.print("Enter the radius: ");



        double radius = rad.nextDouble();

        double area = Math.PI * ( radius * radius);


        System.out.println("The area of circle is: " + area);

    }
}


