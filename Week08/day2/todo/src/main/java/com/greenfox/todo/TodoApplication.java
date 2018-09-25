package com.greenfox.todo;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Learn this stuff"));

        Todo todo2 = new Todo("Learn that stuff");
        todo2.setDone(true);
        todoRepository.save(todo2);

        Todo todo3 = new Todo("I don't know");
        todo3.setUrgent(true);
        todoRepository.save(todo3);
    }
}
