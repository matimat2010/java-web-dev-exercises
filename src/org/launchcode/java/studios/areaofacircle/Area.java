package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    static Scanner rad = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("Enter a radius: ");

        double radius = rad.nextDouble();

       //double area = Math.PI * ( radius * radius);

        double area =  Circle.getArea(radius);

        System.out.println("The area of circle of " + radius +" is: " + area);

    }
}


