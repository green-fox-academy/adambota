import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
    }

    private static String containsSeven(ArrayList<Integer> arrayList) {
        if (arrayList.contains(7)) return "Hoorray";
        else return "Noooooo";
    }
}
