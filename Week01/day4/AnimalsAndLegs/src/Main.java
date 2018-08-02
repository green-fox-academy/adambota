import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickens = sc.nextInt();
        int pigs = sc.nextInt();
        int legs = 2*chickens + 4*pigs;
        System.out.println("That's a total of " +legs + " legs!");
    }
}
