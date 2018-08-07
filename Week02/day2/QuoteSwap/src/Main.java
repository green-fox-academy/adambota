import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }

    private static String quoteSwap(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>(list);
        Collections.swap(newList, 2, 5);
        String noSpace = "";
        for (int i = 0; i < newList.size(); i++) {
            noSpace = noSpace.concat(newList.get(i));
            noSpace = noSpace.concat(" ");
        }
        return noSpace;
    }
}
