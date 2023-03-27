import java.util.Scanner;

public class Main{

    static int fibonacci(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for finding the sum of fibonacci series: ");
        int number = input.nextInt();

        System.out.println("The result of sum: " + fibonacci(number));
    }
}