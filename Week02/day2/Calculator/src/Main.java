import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please type in the expression: ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println(calculate(expression));
    }

    private static double calculate(String expression) {
        double result = 0;
        String[] expr = expression.split(" ");
        double a = Double.parseDouble(expr[1]);
        double b = Double.parseDouble(expr[2]);
        switch (expr[0]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
        }
        return result;
    }
}
