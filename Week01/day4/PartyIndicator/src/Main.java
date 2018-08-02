import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Girls coming:");
        int num1 = sc.nextInt();
        System.out.println("Boys coming:");
        int num2 = sc.nextInt();
        if ((num1 + num2) >= 20 && num1 == num2){
            System.out.println("The party is excellent");
        }
        else if ((num1 + num2) >= 20 && !(num1 == num2) && num1 != 0){
            System.out.println("Quite cool party");
        }
        else if ((num1 + num2) < 20){
            System.out.println("Average party");
        }
        else if (num1 == 0){
            System.out.println("Sausage party");
        }

    }
}
