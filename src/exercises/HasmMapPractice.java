package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class HasmMapPractice {
    public static void main(String[] args){

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;
        String newStudentName;

        System.out.println("Enter the new students Id (or type 0 to finish)" );

        do {

            System.out.print("Student ID: ");
            newStudentId = input.nextInt();

            if(!newStudentId.equals(0)) {
                System.out.print("Student Name: ");
                newStudentName = input.next();
                students.put(newStudentId, newStudentName);

                input.nextLine();
            }



        } while(!newStudentId.equals(0));


        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ":" + student.getValue());
        }
        input.close();
    }
}


