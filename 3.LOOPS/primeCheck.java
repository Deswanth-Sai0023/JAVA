import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        boolean isPrime = num >= 2;
        for (int i = 2; i * i <= num && isPrime; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime ? "it is prime " : "it is not a prime number");
    }
}
