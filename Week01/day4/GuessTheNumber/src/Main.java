import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        boolean correct = false;
        do {
            System.out.println("Your guess:");
            int num = sc.nextInt();
            if (num < random) System.out.println("The stored number is higher");
            else if (num > random) System.out.println("The stored number is lower");
            else if(num == random) correct = true;
        }while (!correct);
        System.out.println("You found the number: " + random);
        }
    }
