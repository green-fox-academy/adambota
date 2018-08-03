import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static void permutate(String perm, String string) {
        if (string.isEmpty()) {
            System.out.println(string + perm);
        } else {
            for (int i = 0; i < string.length(); i++) {
                permutate(perm + string.charAt(i), string.substring(0, i));
            }
        }
    }

    private static void permutation(String string) {
        permutate("", string);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnd = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        String string = sc.nextLine();
        permutation(string);
    }
}
