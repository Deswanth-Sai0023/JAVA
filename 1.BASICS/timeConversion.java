public class timeConversion {
    public static void main(String[] args) {
        int totalSeconds = 7384;
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }
}
