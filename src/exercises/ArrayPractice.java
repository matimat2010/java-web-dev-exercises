package exercises;

import java.util.Arrays;





public class ArrayPractice {

    public static void main(String[] args){
        Integer [] nums = {1, 1, 2, 3, 5, 8};

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String [] strArray = str.split(" " );
        String [] strSent =  str.split("\\.");

        System.out.println("Printing all Numbers");
        for(Integer num : nums){
            System.out.println(num);

        }

    System.out.println("Printing even Numbers");

        for (int i=0; i < nums.length; i++){
            if(nums[i] %2 == 0){
                System.out.println(nums[i]);
            }
        }

    System.out.println(Arrays.toString(strArray));
    System.out.println(Arrays.toString(strSent));




    }
}


