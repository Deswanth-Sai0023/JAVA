public class currencyDenomination {
    public static void main(String[] args) {
        int amount = 2876;

        System.out.println("2000 notes are = " + amount / 2000);
        amount %= 2000;

        System.out.println("500 notes are = " + amount / 500);
        amount %= 500;

        System.out.println("100 notes are = " + amount / 100);
        amount %= 100;

        System.out.println("50 notes are = " + amount / 50);
        amount %= 50;

        System.out.println("10 notes are = " + amount / 10);
        amount %= 10;

        System.out.println("The remaining notes/coins are = " + amount);
    }
}
