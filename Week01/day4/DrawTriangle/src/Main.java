import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number:");
        int num = sc.nextInt();
        String triangle = "";
        for (int i = 1; i < num+1; i++) {
            triangle += "*";
            System.out.println(triangle);
        }
    }
}
