package lk.google.todolistapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * `@authority` DUSHAN MALINDA
 * 00:39
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.dto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {
    private String title;
    private String description;
    private Boolean completed;
    private String priority;
    private Date dueDate;
}
