public class Main {

    public static void main(String[] args) {
        recCounter(10);
    }

    public static int recCounter(int n) {
        if (n == 0) {
            System.out.println(n);
            return 0;
        } else {
            System.out.println(n);
            return recCounter(n - 1);
        }
    }
}
