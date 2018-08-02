import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number:");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Páros");
        }
        else{
            System.out.println("Páratlan");
        }

    }
}
