import java.util.Scanner;


public class ConsoleExercise {

        public static void main(String[] args) {
            double pi = 3.14159;
            String complete = String.format("The value of pi is approximately %.2f", pi);
            System.out.println(complete);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an Integer: ");
            int num = scanner.nextInt();
            System.out.printf("Your number was, %d", num);
}
}
