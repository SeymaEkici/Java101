import java.util.Scanner;

public class Main{

    public static boolean isPrime(int num, int i) {
        if (i == 1) {
            return true;
        } else {
            if (num % i == 0) {
                return false;
            } else {
                return isPrime(num, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n, n / 2)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
}