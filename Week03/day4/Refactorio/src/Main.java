public class Main {

    public static void main(String[] args) {
        System.out.println(refactorio(4));
    }

    public static int refactorio(int n) {
        if (n == 1) return n;
        else return refactorio(n - 1) * n;
    }
}