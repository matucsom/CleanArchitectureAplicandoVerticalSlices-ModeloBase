package CleanArchitecture.com.app.config;

import CleanArchitecture.com.app.application.user.createNewUser.usecase.CreateNewUserImpl;
import CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in.CreateNewUser;
import CleanArchitecture.com.app.application.user.createNewUser.validator.CreateNewUserValidator;
import CleanArchitecture.com.app.application.user.createNewUser.validator.UserValidator;
import CleanArchitecture.com.app.domain.agregadosVariables.policy.UniqueEmailPolicy;
import CleanArchitecture.com.app.domain.agregadosVariables.policy.UserPolicy;
import CleanArchitecture.com.app.domain.ports.out.UserModelPort;
import CleanArchitecture.com.app.infrastructure.adapters.UserModelAdapter;
import CleanArchitecture.com.app.infrastructure.repositories.JpaUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeansConfig {

    // --- Validators (Application) ---
    @Bean
    public UserValidator userValidator() {
        return new CreateNewUserValidator();
    }

    // --- Domain Policies ---
    @Bean
    public UserPolicy userPolicy(UserModelPort userModelPort) {
        return new UniqueEmailPolicy(userModelPort);
    }

    // --- Ports/Adapters ---
    @Bean
    public UserModelPort userModelPort(JpaUserRepository userRepository) {
        return new UserModelAdapter(userRepository);
    }

    // --- Use Case (Application) ---
    @Bean
    public CreateNewUser createNewUser(UserModelPort userModelPort,
                                       UserValidator validator,
                                       UserPolicy userPolicy) {
        return new CreateNewUserImpl(userModelPort, validator, userPolicy);
    }
}
