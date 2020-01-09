package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;


public class CountChar {
   static Scanner searchChar = new Scanner(System.in);
    public static void main(String[] args){
      System.out.println("Enter a string to see how many times each letter appears: ");

       /* String str = "If the product of two terms is zero then common " +
                "sense says at least one of the two terms has to be zero " +
                "to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing " +
                "that side of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there."; */

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String inStr = searchChar.nextLine();
        String str = inStr.toLowerCase();
        System.out.println("Enter a Character to search for");

        char[] charactersInString = str.toCharArray();
        char[] alphaInString = alpha.toCharArray();




             for (int i = 0; i < alphaInString.length; i++) {
                 Integer count = 0;

                 for (int j = 0; j < charactersInString.length; j++) {

                    if (alphaInString[i] == charactersInString[j])
                    {
                        count++;
                     }


                } if (count > 0){
             System.out.println("" + alphaInString[i] + ": appears " + count + " times.");}
            }
        }
}
