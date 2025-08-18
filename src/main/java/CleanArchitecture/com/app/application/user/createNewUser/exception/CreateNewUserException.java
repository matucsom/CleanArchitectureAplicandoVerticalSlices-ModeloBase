package CleanArchitecture.com.app.application.user.createNewUser.exception;

public class CreateNewUserException extends RuntimeException {
    public CreateNewUserException(String message) { super(message); }
    public CreateNewUserException(String message, Throwable cause) { super(message, cause); }
}
