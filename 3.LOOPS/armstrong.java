import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int original = new Scanner(System.in).nextInt();
        int n = original;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        System.out.printf("%d is %san armstrong number%n", original, sum == original ? "" : "not ");
    }
}
