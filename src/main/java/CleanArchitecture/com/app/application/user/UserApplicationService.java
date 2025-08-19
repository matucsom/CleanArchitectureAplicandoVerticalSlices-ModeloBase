package CleanArchitecture.com.app.application.user;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserResponse;
import CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in.CreateNewUser;

public interface UserApplicationService extends CreateNewUser {

    public CreateNewUserResponse createNewUser(CreateNewUserRequest request);
}
