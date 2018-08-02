import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number:");
        int num = sc.nextInt();
        if (num <= 0){
            System.out.println("Not enough");
        }
        else if (num == 1){
            System.out.println("One");
        }
        else if (num == 2){
            System.out.println("Two");
        }
        else if (num > 2){
            System.out.println("A lot");
        }

    }
}
