package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GradesApplication {

    public static void main(String[] args) {

//        HashMap is defined as an empty string array
        HashMap<String, Student> students = new HashMap<>();

//        Objects 'Student' containing Student("") grades
        Student s1 = new Student("Sam");
        s1.addGrade(93);
        s1.addGrade(62);
        s1.addGrade(83);

        Student s2 = new Student("Tim");
        s2.addGrade(95);
        s2.addGrade(90);
        s2.addGrade(89);

        Student s3 = new Student("Jerry");
        s3.addGrade(72);
        s3.addGrade(100);
        s3.addGrade(98);

        Student s4 = new Student("Sean");
        s4.addGrade(84);
        s4.addGrade(92);
        s4.addGrade(76);

//        students.put to add names to students hashmap, line 13
        students.put("sam12", s1);
        students.put("tim34", s2);
        students.put("jerry56", s3);
        students.put("sean78", s4);

//        System.out.println(students.keySet());//[sam12, jerry56, sean78, tim34]


        Set<String> usernameKeys = students.keySet();

        Input userInput = new Input();

        boolean userContinues;

        System.out.printf("%nWelcome!%n");
        System.out.printf("Here are the GitHub usernames of our students:%n");

        //Enhanced For Loop to retrieve and print usernameKeys
        for (String username : usernameKeys) {
            System.out.printf("| %s ",username);
        }

        //Do While Loop to prompt the user to input a student name
        // then display information about that student, including their name and their grades
        do{
            System.out.print("\nWhat student would you like to see more information on?");
            String userChoice = userInput.getString();

            //conditional checking if user has input a valid name
            if(userChoice.equalsIgnoreCase("sam12")) {
            System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", s1.getName(),"sam12",
                    s1.getGradeAverage());
            } else if(userChoice.equalsIgnoreCase("tim34")) {
            System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", s2.getName(),"tim34",
                    s2.getGradeAverage());
            } else if(userChoice.equalsIgnoreCase("jerry56")) {
            System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", s3.getName(),"jerry56",
                    s3.getGradeAverage());
            } else if(userChoice.equalsIgnoreCase("sean78")) {
            System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", s4.getName(),"sean78",
                    s4.getGradeAverage());
            } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s.\"%n", userChoice);
            }
                System.out.print("Would you like to see another student?:");
                userChoice = userInput.getString();

                if (!userChoice.trim().equalsIgnoreCase("y")) {
                    System.out.println("\nGoodbye, and have a wonderful day!\n");
                }

        } while(true);
    }

    public static Map<String, Student> getStudents(){

//        HashMap is defined as an empty string array
        Map<String, Student> students = new HashMap<>();

//        Objects 'Student' containing Student("") grades
        Student s1 = new Student("Sam");
        s1.addGrade(93);
        s1.addGrade(62);
        s1.addGrade(83);

        Student s2 = new Student("Tim");
        s2.addGrade(95);
        s2.addGrade(90);
        s2.addGrade(89);

        Student s3 = new Student("Jerry");
        s3.addGrade(72);
        s3.addGrade(100);
        s3.addGrade(98);

        Student s4 = new Student("Sean");
        s4.addGrade(84);
        s4.addGrade(92);
        s4.addGrade(76);

//        students.put to add names to students hashmap, line 13
        students.put("sam12", s1);
        students.put("tim34", s2);
        students.put("jerry56", s3);
        students.put("sean78", s4);

//        System.out.println(students.keySet());//[sam12, jerry56, sean78, tim34]


        Set<String> usernameKeys = students.keySet();

        Input userInput = new Input();

        return students;
    }
}
