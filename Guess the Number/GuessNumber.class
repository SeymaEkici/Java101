import java.util.*;

public class NumberGuess{

    static void findingNumber(int number){
        Scanner scanner = new Scanner(System.in);
        
        int right = 5;
        System.out.println("Please enter a number between 0 and 100: ");
        int input = scanner.nextInt();
        right--;

        while(right > 0){

            if(input == number){
                
                System.out.println("Congrats! You entered the correct number and WON the game:)");
                break;
            } else if(input >= 0 && input <= 100){

                if(input < number){
                    
                    System.out.println("You couldn't guess the number. But you still have rights: " + right);
                    System.out.println("Now, try again and enter a bigger number: ");
                    input = scanner.nextInt();
                    right--;

                }else{

                    System.out.println("You couldn't guess the number. But you still have rights: " + right);
                    System.out.println("Now, try again and enter a smaller number: ");
                    input = scanner.nextInt();
                    right--;
                }

            } else{
                System.out.println("Your right still same: " + right + ". But please enter a number between 0 and 100!");
            }
        }
    
        if(right == 0){
            System.out.println("You spent all your rights and lose the game :(");
        }

        scanner.close();
    }

    public static void main(String[] args) {

       // Random random = new Random();
       // int number = random.nextInt(100);

        int number = 50;
        System.out.println("Welcome to number guess game!");
        findingNumber(number);
        
    }
}