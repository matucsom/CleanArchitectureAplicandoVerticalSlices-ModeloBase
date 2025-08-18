package CleanArchitecture.com.app.application.user.createNewUser.validator;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;

public interface UserValidator {
    void validate(CreateNewUserRequest request);
}
