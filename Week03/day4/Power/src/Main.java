public class Main {

    public static void main(String[] args) {
        System.out.println(recPower(3, 2));
    }

    public static int recPower(int base, int power) {
        if (power > 0) {
            return (base * recPower(base, power - 1));
        } else return 1;
    }
}