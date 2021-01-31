package javaPractice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BudgetAnalysis {

    public static void main(String[] args) {

        // Create a DecimalFormat object to format output.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the budget amount.
        System.out.print("Enter your budget for the month: ");
        double monthlyBudget = keyboard.nextDouble();
    }

}