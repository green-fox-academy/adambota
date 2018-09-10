import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String foo = "Sample string asdasd";

        Map<Object, Long> frequency = foo.chars()
                .boxed()
                .collect(Collectors.groupingBy(cha -> cha, Collectors.counting()));

        frequency.entrySet().stream()
                .forEach(entry -> System.out.println((char) (int) entry.getKey() + " = " + entry.getValue()));
    }
}
