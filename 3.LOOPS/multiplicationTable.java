import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}
