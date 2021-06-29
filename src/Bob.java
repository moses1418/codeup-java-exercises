import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("User: ");

            String message = sc.nextLine();

            if (message.endsWith("?")) {
                System.out.println("Bob: sure");
            } else if (message.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (message.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (message.equals("bye")) {
                break;
            } else {
                System.out.println("Bob: Whatever bruh");
            }
        }


    }
}
