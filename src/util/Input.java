package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

//    getString()

    public String getString(){
        return this.sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

//     yesNo()

    public boolean yesNo(String prompt){
        System.out.println("Enter yes or no.");
        String input = this.sc.next();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }

//    getInt()

    public int getInt(int i, int i1, String s){
        System.out.println("Enter an int.");
        return this.sc.nextInt();
    }

    public int getInt(int min, int max){
        int input;
        do {
            System.out.printf("Enter an int between %d and %d%n", min, max);
            input = this.sc.nextInt();
        }while(input < min || input > max);{
            return input;
        }
    }

//    getDouble()

    public double getDouble(){
        return this.sc.nextInt();
    }

    public double getDouble(double min, double max){
        double input;
        do {
            System.out.printf("Enter a double between %.2f and %.2f%n", min, max);
            input = this.sc.nextDouble();
        }while(input < min || input > max);{
            return input;
        }
    }



}
