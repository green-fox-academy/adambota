import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        numbers.stream()
                .filter(number -> Math.pow(number, 2) > 20)
                .forEach(number -> System.out.println(number));
    }
}
