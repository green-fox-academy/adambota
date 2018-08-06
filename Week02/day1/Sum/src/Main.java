import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add until number: ");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }

    private static int sum(int num) {
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            sum += i;
        }
        return sum;
    }
}

