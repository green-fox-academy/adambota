import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        decrypt("duplicated-chars.txt");
    }

    public static void decrypt(String path) {
        Path filePath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 1; j < lines.get(i).length(); j += 2) {
                    System.out.print(lines.get(i).charAt(j));
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Could not read file");
        }
    }
}