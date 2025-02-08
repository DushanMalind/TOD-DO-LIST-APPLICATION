package lk.google.todolistapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * `@authority` DUSHAN MALINDA
 * 00:37
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.dto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    private String email;
    private String password;
}
