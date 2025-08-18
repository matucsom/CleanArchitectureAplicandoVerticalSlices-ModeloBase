package CleanArchitecture.com.app.domain.agregadosVariables.exception;

public class BusinessRuleViolationException extends RuntimeException {
    public BusinessRuleViolationException(String message) {
        super(message);
    }
}
