package warmup;

import java.util.Scanner;

public class calculator {
    Scanner sc = new Scanner(System.in);

    public static void calc(Scanner scanner){

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter your operator (+, -, *, /)");
        String op = scanner.next();

        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        switch (op){
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                System.out.println(firstNum / secondNum);
                break;
            default:
                break;
        }

        System.out.println("Would you like to continue calculations? ");
        String userIn = scanner.next();

        if (userIn.equalsIgnoreCase("no")){
            return;
        } else if (userIn.equalsIgnoreCase("yes")){
            calc(scanner);
        }

    }
}













