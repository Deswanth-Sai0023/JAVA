import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int original = new Scanner(System.in).nextInt();
        int n = original;
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        System.out.println(original);
        System.out.println(original == reversed ? "palindrome" : "not palindrome");
    }
}
