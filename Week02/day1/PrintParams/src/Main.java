import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third");
        printParams("first", "second", "third", "fourth");
    }

    private static void printParams(String... args) {
        for (String s : args){
            System.out.println(s);
        }
    }
}

