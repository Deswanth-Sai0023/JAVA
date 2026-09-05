import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("the largest out of 3 is " + Math.max(a, Math.max(b, c)));
    }
}
