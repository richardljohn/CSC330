//Name: Richard John
//Instructor: Professor Richard Weir
//Assignment: Lab 2 - Class Assignment
//Date: February 27, 2021

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class UnitTestRunner {
    public static void main(String[] args){

        //All the neccessary things to store information.
        UnitTest grader = new UnitTest();
        ArrayList<Student> students = new ArrayList<>();
        HashMap<String, ArrayList<String>> classList = new HashMap<String, ArrayList<String>>();

        //grader.printAnswers(); <- Used to check if answer key was correct.

        //Reading in every student's name and answers.
        Scanner x = new Scanner(System.in);
        try{
            x = new Scanner(new File("/Users/richardjohn/Desktop/Git/CSC330/ClassGrader/src/allExams.txt"));
        }
        catch(Exception e){
            System.out.println("No file found.");
            e.printStackTrace();
            System.exit(0);
        }
        while(x.hasNext()){
            ArrayList<String> studentAnswers = new ArrayList<>();

            //First two words of each line will be used to make a student.
            String last = x.next();
            String first = x.next();

            //A student is made and added to the list of students.
            Student student = new Student(first, last);
            students.add(student);

            //An answer sheet of of each student is made.
            String answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);
            answer = x.next();
            studentAnswers.add(answer);

            //We make an id for the student which is just the last name
            //and first name of the student together in lower case.
            String hashedStudent = student.getLastName().toLowerCase() + student.getFirstName().toLowerCase();

            //The student and
            classList.put(hashedStudent, studentAnswers);
        }
        x.close();

//        Iterator<Map.Entry<String, ArrayList<String>>> it = classList.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry<String, ArrayList<String>> mapElement = (Map.Entry<String, ArrayList<String>>)it.next();
//            System.out.print("Student: " + mapElement.getKey() + ", Answers: ");
//            for(int i = 0; i < 10; i++){
//                System.out.print(mapElement.getValue().get(i) + " ");
//            }
//            System.out.println();
//        }

        //We iterate through our hashmap and grade each student.
        Iterator<Map.Entry<String, ArrayList<String>>> it = classList.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, ArrayList<String>> mapElement = (Map.Entry<String, ArrayList<String>>)it.next();
            double grade = grader.calculateGrade(mapElement.getValue());
            for(int i = 0; i < students.size(); i++){
                if(students.get(i).getConcatenated().equals(mapElement.getKey())){
                    students.get(i).setAverage(grade);
                }
            }
//            System.out.print("Student: " + mapElement.getKey() + ", Answers: ");
//            for(int i = 0; i < 10; i++){
//                System.out.print(mapElement.getValue().get(i) + " ");
//            }
//            System.out.println("Grade: " + grader.calculateGrade(mapElement.getValue()));
        }

        //Lastly we display our results.
        System.out.println("Hey students, here are the grades for the last test.");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}

/*
Output:
Hey students, here are the grades for the last test.
Christian Tobacco: 100.0
James Russo: 30.0
John Smith: 30.0
James Henderson: 30.0
Michael Russo: 20.0
John DeMartino: 80.0
Frank Scafuri: 80.0
*/

/* Question.
Can the UnitTest object be modified easily?
As it is, it only initializes an answer key and calculates the percentage correct.
Are there any other functions that you think a UnitTest may hold responsibility?
Think about if you were writing a more robust program for actual teachers –
what other functions may prove useful to them?
Add this response to your output file.
*/

/* Answer.

The UnitTest object can be modified easily. All it requires is a different answer key to be fed to it and it can
grade any multiple choice test. A function I think that would be useful is if there was a storage to show what questions
a student got correct and what questions a student got wrong, and functions that will retrieve things from this storage.
This wouldn't be as useful for math classes or long response questions since it can only grade multiple choice style
tests.

*/
