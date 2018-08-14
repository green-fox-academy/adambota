import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    public static String ticTacResult(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            if (lines.get(0).charAt(0) == 'X' && lines.get(0).charAt(1) == 'X' && lines.get(0).charAt(2) == 'X')
                return "X";
            if (lines.get(1).charAt(0) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(1).charAt(2) == 'X')
                return "X";
            if (lines.get(2).charAt(0) == 'X' && lines.get(2).charAt(1) == 'X' && lines.get(2).charAt(2) == 'X')
                return "X";
            if (lines.get(0).charAt(0) == 'X' && lines.get(1).charAt(0) == 'X' && lines.get(2).charAt(0) == 'X')
                return "X";
            if (lines.get(0).charAt(1) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(1) == 'X')
                return "X";
            if (lines.get(0).charAt(2) == 'X' && lines.get(2).charAt(2) == 'X' && lines.get(2).charAt(2) == 'X')
                return "X";
            if (lines.get(0).charAt(0) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(2) == 'X')
                return "X";
            if (lines.get(0).charAt(2) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(0) == 'X')
                return "X";
            if (lines.get(0).charAt(0) == 'O' && lines.get(0).charAt(1) == 'O' && lines.get(0).charAt(2) == 'O')
                return "O";
            if (lines.get(1).charAt(0) == 'O' && lines.get(1).charAt(1) == 'O' && lines.get(1).charAt(2) == 'O')
                return "O";
            if (lines.get(2).charAt(0) == 'O' && lines.get(2).charAt(1) == 'O' && lines.get(2).charAt(2) == 'O')
                return "O";
            if (lines.get(0).charAt(0) == 'O' && lines.get(1).charAt(0) == 'O' && lines.get(2).charAt(0) == 'O')
                return "O";
            if (lines.get(0).charAt(1) == 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(1) == 'O')
                return "O";
            if (lines.get(0).charAt(2) == 'O' && lines.get(2).charAt(2) == 'O' && lines.get(2).charAt(2) == 'O')
                return "O";
            if (lines.get(0).charAt(0) == 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(2) == 'O')
                return "O";
            if (lines.get(0).charAt(2) == 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(0) == 'O')
                return "O";
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
        return "draw";
    }
}