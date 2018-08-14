import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(countLines("my-file.txt"));
    }

    public static int countLines(String name) {
        try {
            Path filePath = Paths.get(name);
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}