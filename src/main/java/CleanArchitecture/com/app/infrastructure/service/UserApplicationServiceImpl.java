package CleanArchitecture.com.app.infrastructure.service;

import CleanArchitecture.com.app.application.user.UserApplicationService;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserResponse;
import CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in.CreateNewUser;
import CleanArchitecture.com.app.infrastructure.factory.UserUseCaseFactory;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationServiceImpl implements UserApplicationService {

    private final CreateNewUser createNewUser ;

    public UserApplicationServiceImpl(UserUseCaseFactory factory) {
        this.createNewUser = factory.createNewUserUseCase();
    }


    @Override
    @Transactional
    public CreateNewUserResponse createNewUser(CreateNewUserRequest request) {
        return createNewUser.createNewUser(request);
    }
}
