import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println(sweets(arrayList));
    }

    private static ArrayList<Object> sweets(ArrayList<Object> old) {
        ArrayList<Object> corrected = new ArrayList<>(old);
        corrected.set(1, "Croissant");
        corrected.set(3, "Ice cream");
        return corrected;
    }
}
