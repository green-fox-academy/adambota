import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number to check:");
        String input = sc.nextLine();
        int[] numbers = new int[input.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Character.getNumericValue(input.charAt(i));
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], numbers.length);
        }
        if (sum == Integer.parseInt(input)) System.out.println(input + " is an Armstrong number.");
        else System.out.println(input + " is not an Armstrong number.");
    }
}
