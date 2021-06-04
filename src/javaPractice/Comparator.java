package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Comparator {

    class Student {
        private final int id;
        private final String name;
        private final double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }
    }

}
