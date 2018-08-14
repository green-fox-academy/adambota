import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        decrypt("reversed-order.txt");
    }

    public static void decrypt(String path) {
        Path filePath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = lines.size() - 1; i >= 0; i--) {
                if (!lines.get(i).equals("")) {
                    for (int j = 0; j < lines.get(i).length(); j++) {
                        System.out.print(lines.get(i).charAt(j));
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Could not read file");
        }
    }
}