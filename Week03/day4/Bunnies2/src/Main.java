public class Main {

    public static void main(String[] args) {
        System.out.println(countEars(6));
    }

    public static int countEars(int n) {
        if (n == 1) return 2;
        else if (n % 2 == 1) {
            int ears = countEars(n - 1) + 2;
            return ears;
        } else {
            int ears = countEars(n - 1) + 3;
            return ears;
        }
    }
}