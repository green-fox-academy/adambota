import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify the kilometres");
        double km = sc.nextDouble();
        System.out.println("In miles that is: " + km/1.609344);
    }
}
