import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;

public class Task {
    private boolean completed;
    private String description;
    private LocalDateTime createdAt;

    private LocalDateTime completedAt;

    private Duration duration;
    private int id;
    public Task(String description, int id) {
        this.completed = false;
        this.description = description;
        this.id = id;
        createdAt = LocalDateTime.now(Clock.systemUTC());
    }
    public Task(Boolean completed, String description, int id, String created, String completedAt) {
        this.completed = completed;
        this.description = description;
        this.id = id;
        this.createdAt = LocalDateTime.parse(created);
        if (completed) {
            this.completedAt = LocalDateTime.parse(completedAt);
        }
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public Duration completionTime(){
        return Duration.between(createdAt,completedAt);
    }
}
