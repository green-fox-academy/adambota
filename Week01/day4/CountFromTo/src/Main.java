import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your first number:");
        int num1 = sc.nextInt();
        System.out.println("Your second number:");
        int num2 = sc.nextInt();
        if (num2 < num1) System.out.println("The second number should be bigger");
        else{
        for (int i = num1; i < num2; i++) {
            System.out.println(i);
            }
        }
    }
}
