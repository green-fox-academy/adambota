import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path filePath = Paths.get("log.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            String[][] splitLines = new String[lines.size()][10];
            for (int i = 0; i < lines.size(); i++) {
                splitLines[i] = lines.get(i).split(" ");
            }
            String[] uniqueIPs = uniqueIPAddresses(splitLines);
            for (int i = 0; i < uniqueIPs.length; i++) {
                System.out.println(uniqueIPs[i]);
            }
            System.out.println("GET / POST request ratio: " + getPostRatio(splitLines));
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static String[] uniqueIPAddresses(String[][] log) {
        String uniques = "";
        for (int i = 0; i < log.length; i++) {
            if (!uniques.contains(log[i][8])) {
                uniques += (" " + log[i][8]);
            }
        }
        String[] uniquesArray = new String[log.length];
        uniquesArray = uniques.split(" ");
        return uniquesArray;
    }

    public static double getPostRatio(String[][] log) {
        double numberOfGets = 0;
        double numberOfPosts = 0;
        for (int i = 0; i < log.length; i++) {
            if (log[i][11].equals("GET")) numberOfGets++;
            else numberOfPosts++;
        }
        return numberOfGets / numberOfPosts;
    }
}