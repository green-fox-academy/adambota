package com.greenfox.todo.repositories;

import com.greenfox.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByTitleContains(String title);
}
