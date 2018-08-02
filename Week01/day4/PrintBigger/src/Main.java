import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your first number:");
        int num1 = sc.nextInt();
        System.out.println("Your second number:");
        int num2 = sc.nextInt();
        if (num1 < num2){
            System.out.println(num2);
        }
        else if (num1 == num2){
            System.out.println("Same");
        }
        else if (num1 > num2){
            System.out.println(num1);
        }

    }
}
