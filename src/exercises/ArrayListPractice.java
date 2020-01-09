package exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){

    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    ArrayList<Integer> numList = new ArrayList<>();
    for (int num: nums){
        numList.add(num);
    }
        Integer sum = 0;

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 0){
            sum += numList.get(i);}

        }
        System.out.println(sum);


        Scanner input = new Scanner(System.in);


        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String strArray[] = str.split(" ");
        List<String> aL = new ArrayList<String>();
        aL = Arrays.asList(strArray);
        System.out.println(aL);

        System.out.println("What size word do you want to search for?");
        Integer user = input.nextInt();

        for (int i = 0; i < aL.size(); i++){
            if(aL.get(i).length() == (user)) {
                System.out.println(aL.get(i));
            }

            input.close();
        }

    }
}





