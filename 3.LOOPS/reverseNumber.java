import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(sign * reverse);
    }
}
