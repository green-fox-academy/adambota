public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int fibonacci(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}