package lk.google.todolistapplication.repo;

import lk.google.todolistapplication.entity.Todo;
import lk.google.todolistapplication.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * `@authority` DUSHAN MALINDA
 * 00:43
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.repo
 */
public interface TodoRepository extends JpaRepository<Todo, UUID> {
    List<Todo> findByUser(User user);

    Page<Todo> findByUser(User user, Pageable pageable);

    // Custom query for searching todos by title containing a keyword
    /*@Query("SELECT t FROM Todo t WHERE t.user = :user AND LOWER(t.title) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Todo> findByUserAndTitleContainingIgnoreCase(@Param("user") User user, @Param("keyword") String keyword);*/

    List<Todo> findByTitleContainingAndUser(String title, User user);
}
