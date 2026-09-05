import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char operator = scan.next().charAt(0);
        int b = scan.nextInt();
        switch (operator) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            case '%': System.out.println(a % b); break;
            default: System.out.println("Invalid operator");
        }
    }
}
