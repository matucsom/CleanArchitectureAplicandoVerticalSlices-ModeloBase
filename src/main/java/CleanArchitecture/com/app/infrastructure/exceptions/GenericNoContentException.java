package CleanArchitecture.com.app.infrastructure.exceptions;

public class GenericNoContentException extends RuntimeException {
    public GenericNoContentException(String message) {
        super(message);
    }
}