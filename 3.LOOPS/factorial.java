import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
