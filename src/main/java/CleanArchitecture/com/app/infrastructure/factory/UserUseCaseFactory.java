package CleanArchitecture.com.app.infrastructure.factory;

import CleanArchitecture.com.app.application.user.createNewUser.usecase.CreateNewUserImpl;
import CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in.CreateNewUser;
import CleanArchitecture.com.app.application.user.createNewUser.validator.CreateNewUserValidator;
import CleanArchitecture.com.app.domain.agregadosVariables.policy.UniqueEmailPolicy;
import CleanArchitecture.com.app.domain.ports.out.UserModelPort;
import CleanArchitecture.com.app.infrastructure.adapters.UserModelAdapter;
import CleanArchitecture.com.app.infrastructure.repositories.JpaUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserUseCaseFactory {

    private final UserModelPort userModelPort;
    private final JpaUserRepository jpaUserRepository;

    public UserUseCaseFactory(UserModelPort userModelPort, JpaUserRepository jpaUserRepository) {
        this.userModelPort = userModelPort;
        this.jpaUserRepository = jpaUserRepository;
    }

    public CreateNewUser createNewUser() {
        return new CreateNewUserImpl(
                new UserModelAdapter(jpaUserRepository),
                new CreateNewUserValidator(),
                new UniqueEmailPolicy(userModelPort)
        );
    }



   /*public DeleteUser deleteUser() {
        return new DeleteUserImpl(
                new UserModelAdapter(userRepository),
                new CreateNewUserValidator(),
                new UniqueEmailPolicy(userRepository)
        );
    }*/
}
