import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        writeLinesToFile("my-file.txt", "Apple", 5);
    }

    public static void writeLinesToFile(String path, String word, int lines) {
        List<String> content = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            content.add(word);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Could not write the file!");
        }
    }
}