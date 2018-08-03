import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines do you want for your square");
        int num = sc.nextInt();
        String topAndBottom = "%%%%%";
        String middle = "%   %";
        System.out.println(topAndBottom);
        for (int i = 0; i < num - 2; i++) {
            System.out.println(middle);
        }
        System.out.println(topAndBottom);
    }
}