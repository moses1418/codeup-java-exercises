import java.util.Scanner;

public class lectureToDo {

    public static void main(String[] args) {

        //
//     TODO: create three unique usernames (user1, user2, user3).
//      create a fourth user and set it equal to user input. (ask
//      the user to enter a username). if the username has already
//      been used by user1, user2, or user3, print "sorry this
//      username already exists.
        Scanner sc = new Scanner(System.in);

        String user1 = "chris";
        String user2 = "amado";
        String user3 = "errrrik";

        System.out.println("Emter user name:");

        String userInput = sc.next();

        if (userInput.equals(user1) || userInput.equals(user2) || userInput.equals(user3)) {
            System.out.println("Sorry, that name is taken");
        } else {
            System.out.println("you have a valid username");
        }


        //TODO: refactor your code from the previous mini exercise into a switch statement

        switch(userInput){

            case "Erik":
                System.out.println("Sorry this username already exists.");
                break;
            case "Moses":
                System.out.println("Sorry this username already exists.");
                break;
            case "Amado":
                System.out.println("Sorry this username already exists.");
                break;
            default:
                System.out.println("You have a valid username.");
                break;
        }




    }



}
