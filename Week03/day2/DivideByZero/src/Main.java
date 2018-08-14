public class Main {

    public static void main(String[] args) {
        try {
            divideTenBy(0);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

    public static void divideTenBy(int num) {
        System.out.println(10 / num);
    }
}
