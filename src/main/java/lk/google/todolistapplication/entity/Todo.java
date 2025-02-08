package lk.google.todolistapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

/**
 * `@authority` DUSHAN MALINDA
 * 00:31
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.entity
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;
    private String description;
    private Boolean completed;
    private String priority;
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
