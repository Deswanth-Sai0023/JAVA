import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        int num = Math.abs(new Scanner(System.in).nextInt());
        int count = num == 0 ? 1 : 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
