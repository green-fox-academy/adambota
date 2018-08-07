import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        System.out.println(appendA(far));
    }

    private static ArrayList<String> appendA(List<String> withoutA) {
        ArrayList<String> withA = new ArrayList<>();
        for (int i = 0; i < withoutA.size(); i++) {
            withA.add(withoutA.get(i) + "a");
        }
        return withA;
    }
}
