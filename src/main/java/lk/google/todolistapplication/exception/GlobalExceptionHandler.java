package lk.google.todolistapplication.exception;

import lk.google.todolistapplication.dto.AuthResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * `@authority` DUSHAN MALINDA
 * 00:28
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.exception
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({UnauthorizedException.class})
    public ResponseEntity<AuthResponse> handleUnauthorizedException(UnauthorizedException ex) {
        AuthResponse response = new AuthResponse(null, "Unauthorized access: " + ex.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
    }
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + ex.getMessage());
    }
}
