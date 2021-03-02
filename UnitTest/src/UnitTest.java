//Name: Richard John
//Instructor: Professor Richard Weir
//Assignment: Lab 2 - Class Assignment
//Date: February 27, 2021

import java.io.*;
import java.util.*;

public class UnitTest {

    //Private Data Members
    private Scanner input;
    private ArrayList<String> answers = new ArrayList<String>();

    //Public Data Members
    //Default Constructor will load all UnitTest classes with the answer key for the test.
    UnitTest(){
        try {
            input = new Scanner(new File("/Users/richardjohn/Desktop/Git/CSC330/UnitTest/src/answers.txt"));
        }
        catch (Exception e){
            System.out.println("No file found.");
            e.printStackTrace();
            System.exit(0);
        }
        //We read the file.
        while(input.hasNext()){
            String a = input.next();
            answers.add(a);
        }
        //Then we close the file.
        input.close();
    }

    //Returns a calculated grade of a Student's answer sheet.
    public double calculateGrade(ArrayList<String> attempt) {
        double grade = 0.0;
        for(int i = 0; i < attempt.size(); i++){
            if(attempt.get(i).equals(answers.get(i))){
                grade++;
            }
        }
        return grade * 10.0;
    }

    //Function that helps check each
    public void printAnswers(){
        for(int i = 0; i < answers.size(); i++){
            System.out.println(answers.get(i));
        }
    }

}