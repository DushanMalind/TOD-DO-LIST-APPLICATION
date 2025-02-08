package lk.google.todolistapplication.service;

import lk.google.todolistapplication.dto.TodoDTO;
import lk.google.todolistapplication.entity.Todo;
import lk.google.todolistapplication.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

/**
 * `@authority` DUSHAN MALINDA
 * 00:46
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.service
 */
public interface TodoService {
    Todo createTodo(TodoDTO todoDTO, User user);
    List<Todo> getTodos(User user);
    Todo updateTodo(UUID id, TodoDTO todoDTO, User user);
    void deleteTodo(UUID id, User user);

    Page<Todo> getTodosByPage(User user, Pageable pageable);
    List<Todo> searchTodos(User user, String keyword);
}
