import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int fourth = sc.nextInt();
        int fifth = sc.nextInt();
        int sum = first + second + third + fourth + fifth;
        int avg = sum/5;
        System.out.println("Their sum is: " + sum + ", average is: " + avg);
    }
}
