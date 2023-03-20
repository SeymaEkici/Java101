import java.util.*;

public class Main{

    static void isPalindrome(int number){

        int reversedNumber = 0, remainder, originalNumber;
        originalNumber = number;

        while(number != 0){
            remainder = number % 10;
            reversedNumber = reversedNumber*10 + remainder;
            number /= 10;
        }

        if(originalNumber == reversedNumber){
            System.out.println(originalNumber + " is a polindrome number.");
        }else{
            System.out.println(originalNumber + " is NOT a polindrome nuber.");
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        input.close();

        isPalindrome(number);
    }

}