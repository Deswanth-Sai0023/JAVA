import java.util.Scanner;

public class largestOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("the largest num is = " + Math.max(a, b));
    }
}
