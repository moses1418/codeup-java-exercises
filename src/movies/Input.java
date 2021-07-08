package movies;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    static int userInput = 0;

    public static int getUserInput() {
        return userInput;
    }

    public static void setUserInput(int userInput){
        Input.userInput = userInput;
    }

    public Input(){
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        setUserInput(scanner.nextInt());
        getMovies(getUserInput());
    }

    private void getMovies(int userInput) {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

}















