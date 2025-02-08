package lk.google.todolistapplication.repo;

import lk.google.todolistapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * `@authority` DUSHAN MALINDA
 * 00:42
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.repo
 */
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
}
