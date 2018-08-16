public class Main {

    public static void main(String[] args) {
        System.out.println(countEars(7));
    }

    public static int countEars(int n) {
        if (n == 1) return 2;
        else {
            int ears = countEars(n - 1) + 2;
            return ears;
        }
    }
}