public class Main {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingHours = 24 - currentHours -1;
        int remainingMinutes = 60 - currentMinutes -1;
        int remainingSeconds = 60 - currentSeconds;

        int totalRemainingSeconds = remainingSeconds + (remainingMinutes*60) + (remainingHours*60*60);
        System.out.println("Remaining seconds: " + totalRemainingSeconds);
    }
}
