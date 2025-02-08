package lk.google.todolistapplication.exception;

/**
 * `@authority` DUSHAN MALINDA
 * 00:28
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.exception
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }

    // Optionally, you can override the getMessage() method if needed.
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

