package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
    String text = "alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister " +
            "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
            "thought alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word are you searching for?: ");
        String search = input.nextLine().toLowerCase();
        System.out.print(text.contains(search));

        int index = text.indexOf(search);
        int length = search.length();

        if (text.contains(search) == true) {
            System.out.print("\n" + search + " has an index of " + index + " and a length of " + length);
            String newString = text.replaceAll(search,"");

            System.out.print("\n" + newString);
        }
    }
}


