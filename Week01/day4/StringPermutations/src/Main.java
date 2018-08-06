import java.util.Scanner;

public class Main {

    private static void permutate(String perm, String string) {
        if (string.isEmpty()) {
            System.out.println(string + perm);
        } else {
            for (int i = 0; i < string.length(); i++) {
                permutate(perm + string.charAt(i), string.substring(0, i) + string.substring(i + 1, string.length()));
            }
        }
    }

    private static void permutation(String string) {
        permutate("", string);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        permutation(string);
    }
}
