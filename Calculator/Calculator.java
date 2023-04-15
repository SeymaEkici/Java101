import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first integer number: ");
        int first = input.nextInt();
        System.out.print("Please enter the second integer number: ");
        int second = input.nextInt();

        System.out.print("Enter the operator which you want to do ( + , - , * , / , % ): ");
        String operator = input.next();

        switch (operator){
            case "+":
                System.out.println("Sum: " + (first + second));
                break;
            case "-":
                System.out.println("Minus: " + (first - second));
                break;
            case "*":
                System.out.println("Multiply: " + (first * second));
                break;
            case "/":
                System.out.println("Divide: " + (first / second));
                break;
            case "%":
                System.out.println("Mod: " + (first % second));
                break;
            default:
                System.out.println("You entered the wrong input. Please try again!");
        }
    }
}