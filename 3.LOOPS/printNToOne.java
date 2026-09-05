import java.util.Scanner;

public class printNToOne {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        while (n > 0) {
            System.out.println(n--);
        }
    }
}
