package CleanArchitecture.com.app.application.user.createNewUser.validator;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.exception.CreateNewUserException;

public class CreateNewUserValidator implements UserValidator {

    @Override
    public void validate(CreateNewUserRequest request) {
        if (request.getEmail() == null || request.getEmail().isBlank()) {
            throw new CreateNewUserException("Email no puede ser vacío");
        }
        if (request.getPassword() == null || request.getPassword().isBlank()) {
            throw new CreateNewUserException("Password no puede ser vacío");
        }
    }
}
