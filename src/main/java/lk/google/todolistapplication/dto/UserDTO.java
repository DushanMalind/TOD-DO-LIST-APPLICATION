package lk.google.todolistapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * `@authority` DUSHAN MALINDA
 * 00:40
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.dto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private UUID id;
    private String email;
    private String password;
}
