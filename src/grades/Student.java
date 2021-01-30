package grades;

import java.util.ArrayList;

public class Student {
    private String name;

//  set grades as an array list of integers
    private ArrayList<Integer> grades;

    //Constructor that sets name property and
    // initializes the grades property as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//    Methods
    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;

        for (int grade : this.grades) {
            sum += grade;
        }

        return sum / this.grades.size();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Peter");
        s1.addGrade(80);
        s1.addGrade(87);
        s1.addGrade(92);

        Student s2 = new Student("Stephen");
        s2.addGrade(95);
        s2.addGrade(90);
        s2.addGrade(89);

        Student s3 = new Student("Alyssa");
        s3.addGrade(72);
        s3.addGrade(65);
        s3.addGrade(86);

//      looking to test getGradeAverage here
        s1.getGradeAverage();
        s2.getGradeAverage();
        s3.getGradeAverage();
    }
}
