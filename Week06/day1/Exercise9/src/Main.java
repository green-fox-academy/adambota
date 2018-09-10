import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        char[] array = {'T', 'h', 'i', 's', 'i', 's', 'a', 'S', 't', 'r', 'i', 'n', 'g'};

        new String(array)
                .chars()
                .forEach((c -> System.out.print((char) c)));
    }
}
