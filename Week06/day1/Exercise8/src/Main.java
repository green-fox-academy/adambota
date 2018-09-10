import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Object, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));

        frequency.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
