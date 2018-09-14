import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Clock;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        initializeFile();
        if (args.length == 1 && args[0].equals("-l")) {
            fillList();
            TaskManager.listTasks();
        } else if (args.length == 2 && args[0].equals("-a")) {
            fillList();
            emptyFile();
            TaskManager.addTask(args[1]);
            TaskManager.printListToFile();
            fillList();
        } else if (args.length == 1 && args[0].equals("-a")) {
            System.out.println("Unable to add: no description provided");
        } else if (args.length == 2 && args[0].equals("-r")) {
            fillList();
            TaskManager.removeTask(Integer.parseInt(args[1]) - 1);
            emptyFile();
            TaskManager.printListToFile();
            fillList();
        } else if (args.length == 1 && args[0].equals("-r")) {
            System.out.println("Unable to remove: no index provided");
        } else if (args.length == 1 && args[0].equals("-c")) {
            System.out.println("Unable to check: no index provided");
        } else if (args.length == 2 && args[0].equals("-c")) {
            fillList();
            TaskManager.checkTask(Integer.parseInt(args[1]) - 1);
            emptyFile();
            TaskManager.printListToFile();
            fillList();
        } else printUsage();
    }

    private static void initializeFile() {
        File todo = new File(".//todo.txt");
        if (!todo.exists()) {
            try {
                todo.createNewFile();
            } catch (java.io.IOException e) {
                System.out.println("Error");
            }
        }
    }

    private static void emptyFile() {
        File todo = new File("todo.txt");
        todo.delete();
        try {
            todo.createNewFile();
        } catch (java.io.IOException e) {
            System.out.println("Error");
        }
    }

    private static void fillList() {
        File todo = new File(".//todo.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(todo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("0")) {
                    TaskManager.addTaskFromFile(false, split[2], Integer.parseInt(split[1]), split[3], "2018-09-13T15:28:27.247");
                } else {
                    TaskManager.addTaskFromFile(true, split[2], Integer.parseInt(split[1]), split[3], split[4]);
                }
                TaskManager.setCurrentId(Integer.parseInt(split[1]));
            }
        } catch (java.io.IOException e) {
            System.out.println("Error");
        }
    }

    private static void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes a task");
        System.out.println("-c   Completes a task");
    }
}
