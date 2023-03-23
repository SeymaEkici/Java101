import java.util.*;

public class Main{

    static int exponential(int base, int exponent){

        if(exponent == 0){
            return 1;
        }
        return base*exponential(base, exponent-1);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        System.out.println("Result is: " + exponential(base, exponent));
    }
}