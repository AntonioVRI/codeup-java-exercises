import java.util.Scanner;

//  In JAVA everything is an OBJECT

public class ConsoleExercises {


    public static void main(String[] args) {
        System.out.println("Console Exercises!");
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.\n", pi );

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter an integer");
//        int number = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Please enter 3 words");
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();
//
//        System.out.printf("Your three words are:\n %s\n %s\n %s\n", word1, word2, word3);
//        sc.nextLine();
//
//        System.out.println("Give me a sentence please");
//        String someSentence = sc.nextLine();
//        System.out.printf("%s? What is that?", someSentence);


    //  CALCULATING PERIMETER AND AREA

        System.out.println("Please enter the length of the classroom.");
        int length = sc.nextInt();

        System.out.println("Please enter the width of the classroom.");
        int width = sc.nextInt();

        int area = length * width;
        int perimeter = (2*length) + (2*width);

        System.out.printf("The area of the classroom is: %d\n", area);
        System.out.printf("The perimeter of the classroom is: %d\n", perimeter);

    }
}
