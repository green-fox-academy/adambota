import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> matchesList = new ArrayList<>();
        int smallerSize = 0;
        if (a.size() > b.size()) smallerSize = b.size();
        else smallerSize = a.size();
        for (int i = 0; i < smallerSize; i++) {
            matchesList.add(a.get(i));
            matchesList.add(b.get(i));
        }
        return matchesList;
    }
}
