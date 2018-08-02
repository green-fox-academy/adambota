import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter an integer");
            sum += sc.nextInt();
        }
        System.out.println("Sum: " + sum + ", Average: " + (double)sum/num);
    }
}
