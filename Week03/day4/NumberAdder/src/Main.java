public class Main {

    public static void main(String[] args) {
        System.out.println(numberAdder(10));
    }

    public static int numberAdder(int n) {
        if (n == 1) return 1;
        else return numberAdder(n - 1) + n;
    }
}
