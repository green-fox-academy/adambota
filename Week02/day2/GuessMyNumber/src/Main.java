import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start range:");
        int start = sc.nextInt();
        System.out.println("End range:");
        int end = sc.nextInt();
        int lives = 5;
        int random = ThreadLocalRandom.current().nextInt(start, end + 1);
        System.out.println(random);
        boolean correct = false;
        System.out.println("I have the number between " + start + "-" + end + ". You have 5 lives.");
        do {
            int guess = sc.nextInt();
            if (guess == random) {
                correct = true;
                System.out.println("Congratulations. You won!");
            } else if (guess > random) {
                lives--;
                System.out.println("Too high. You have " + lives + " lives left");
            } else if (guess < random) {
                lives--;
                System.out.println("Too low. You have " + lives + " lives left");
            }

        } while (!correct && lives > 0);
    }
}
