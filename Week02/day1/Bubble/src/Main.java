import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    }

    private static String bubble(int[] list) {
        Arrays.sort(list);
        String string = Arrays.toString(list);
        return string;
    }

    private static String advancedBubble(int[] list, boolean reverse) {
        if (!reverse) {
            Arrays.sort(list);
            String string = Arrays.toString(list);
            return string;
        } else {
            for (int i = 0; i < list.length; i++) {
                list[i] *= -1;
            }
            Arrays.sort(list);
            for (int i = 0; i < list.length; i++) {
                list[i] *= -1;
            }
            String string = Arrays.toString(list);
            return string;
        }
    }
}
