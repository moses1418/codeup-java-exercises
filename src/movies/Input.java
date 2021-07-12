package movies;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public int showOptions() {
        {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n"+
                    "6 - view movies in the musical category\n"+
                    "\n" +
                    "Enter your choice: ");
            //setUserInput(scanner.nextInt());
            return scanner.nextInt();
        }
    }
}















