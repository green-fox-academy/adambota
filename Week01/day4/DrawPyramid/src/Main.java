import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines do you want for your pyramid?");
        int num = sc.nextInt();
        int maxSpaces = num - 1;
        int star = 1;
        int currentSpaces = 0;
        int currentStar = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("");
            do {
                System.out.print(" ");
                currentSpaces++;
            } while (currentSpaces <= maxSpaces);
            do {
                System.out.print("*");
                currentStar++;
            } while (currentStar != star);
            currentSpaces = 0;
            currentStar = 0;
            star += 2;
            maxSpaces--;
        }
    }
}
