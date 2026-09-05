import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        long num = new Scanner(System.in).nextLong();
        System.out.println(num % 2 == 0 ? "Even" : "odd");
    }
}
