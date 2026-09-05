import java.util.Scanner;

public class sentinelInputLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }
    }
}
