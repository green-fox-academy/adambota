import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static List<Task> list = new ArrayList<>();

    private static int currentId = 0;

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        TaskManager.currentId = currentId;
    }

    static void listTasks() {
        if (list.size() == 0) System.out.println("No todos for today! :)");
        else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCompleted())
                    System.out.println(list.get(i).getId() + " - [X] " + list.get(i).getDescription() + " " + list.get(i).getCreatedAt() + " " + list.get(i).getCompletedAt() + " " + list.get(i).completionTime());
                else
                    System.out.println(list.get(i).getId() + " - [ ] " + list.get(i).getDescription() + " " + list.get(i).getCreatedAt());
            }
        }
    }

    static void addTask(String description) {
        currentId++;
        list.add(new Task(description, currentId));
    }

    static void addTaskFromFile(Boolean completed, String description, int id, String created, String completedat) {
        list.add(new Task(completed, description, id, created, completedat));
    }

    static void removeTask(int i) {
        if (i > list.size() - 1 || i < 0) {
            System.out.println("Unable to remove: index is out of bounds");
            return;
        }
        list.remove(i);
    }

    static void checkTask(int i) {
        if (i > list.size() - 1 || i < 0) {
            System.out.println("Unable to check: index is out of bounds");
            return;
        }
        list.get(i).setCompleted(true);
        list.get(i).setCompletedAt(LocalDateTime.now(Clock.systemUTC()));
    }

    static void printListToFile() {
        File todo = new File("todo.txt");
        for (Task task : list) {
            List<String> content = new ArrayList<>();
            if (task.getCompleted()) {
                content.add("1," + task.getId() + "," + task.getDescription() + "," + task.getCreatedAt() + "," + task.getCompletedAt());
            } else {
                content.add("0," + task.getId() + "," + task.getDescription() + "," + task.getCreatedAt());
            }
            if (todo.exists()) {
                try {
                    Path filePath = Paths.get("todo.txt");
                    Files.write(filePath, content, StandardOpenOption.APPEND);
                } catch (java.io.IOException e) {
                    System.out.println("Error");
                }
            }
        }
    }
}
