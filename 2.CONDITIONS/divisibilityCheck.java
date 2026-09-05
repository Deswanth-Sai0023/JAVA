import java.util.Scanner;

public class divisibilityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int divisor = scan.nextInt();
        System.out.println(num % divisor == 0 ? "divisible" : "not divisible");
    }
}
