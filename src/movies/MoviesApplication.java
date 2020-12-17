package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        moviePrompt();
    }

    public static void moviePrompt() {
        Input userInput = new Input();
        Movie[] movieObj = MoviesArray.findAll();
        boolean userContinues = true;

        System.out.printf("%40s", " MOVIES! ");

        do {
            System.out.println("Where would you like to go?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            int userChoice = userInput.getInt(0, 5, "\nEnter your choice here: ");

            if(userChoice == 0) {
                break;
            } else {
                for (Movie movie : movieObj) {
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();

                    switch(userChoice) {
                        case 1:
                            System.out.printf("%n%s -- %s", movieName, movieCategory);
                            break;
                        case 2:
                            if(movieCategory.equals("animated")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        case 3:
                            if(movieCategory.equals("drama")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        case 4:
                            if(movieCategory.equals("horror")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        case 5:
                            if(movieCategory.equals("sci-fi")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        default:
                            userContinues = false;
                            break;
                    }
                }
            }
            userContinues = userInput.yesNo("\nDo you want to continue? (Y/N): ");

        } while(userContinues);

        System.out.println("Exiting...");
    }

}
