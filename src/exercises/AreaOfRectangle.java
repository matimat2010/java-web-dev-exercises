package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("What is the length of the rectangle?: ");
      int l = input.nextInt();
      System.out.println("What is the width of the rectangle?: ");
      int w = input.nextInt();

      int area =  l*w;

      System.out.println("The Area of the rectangle is: " + area);

}
}


