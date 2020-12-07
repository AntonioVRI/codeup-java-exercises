import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 100;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        modulus(a, b);
        getInt(a, b);

        rollDiceGame(sc);
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.printf("%d + %d = %d%n", a, b, c);
    }

    public static void subtract(int a, int b) {
        int c = a - b;
        System.out.printf("%d - %d = %d%n", a, b, c);
    }

    public static void multiply(int a, int b) {
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += a;
        }
        System.out.printf("%d * %d = %d%n", a, b, c);
    }

    public static void divide(int a, int b) {
        if (a == 0 || b == 0) {
            int c = 0;
            System.out.printf("%d / %d = %d%n", a, b, c);
        } else if (a < b) {
            float d = (float) a;
            float e = (float) b;
            float c = d / e;
            System.out.printf("%.0f / %.0f = %.2f%n", d, e, c);
        } else {
            int c = a / b;
            System.out.printf("%d / %d = %d%n", a, b, c);
        }
    }

    public static void modulus(int a, int b) {
        if (a == 0) {
            int c = 0;
            System.out.printf("%d %% %d = %d%n", a, b, c);
        } else if (b == 0) {
            int c = a;
            System.out.printf("%d %% %d = %d%n", a, b, c);
        } else {
            int c = a % b;
            System.out.printf("%d %% %d = %d%n", a, b, c);
        }
    }

    public static int getInt(int min, int max) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Print a # between 1 & 20");
        int userInt;
        userInt = scan.nextInt();

        if (userInt < min || userInt > max) {
            System.out.println(userInt);
            return userInt;
        }


        return userInt;
    }

    ////    Create an application that simulates dice rolling.
////    Ask the user to enter the number of sides for a pair of dice.
////    Prompt the user to roll the dice.
////"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
////            Use static methods to implement the method(s) that generate the random numbers.
////    Use the .random method of the java.lang.Math class to generate random numbers.
//
//
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInt(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
        } while (!userChoice.equals("n"));
    }
}
