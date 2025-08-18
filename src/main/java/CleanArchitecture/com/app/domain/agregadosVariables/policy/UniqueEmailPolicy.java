package CleanArchitecture.com.app.domain.agregadosVariables.policy;

import CleanArchitecture.com.app.domain.agregadosVariables.exception.BusinessRuleViolationException;
import CleanArchitecture.com.app.domain.model.User;
import CleanArchitecture.com.app.domain.ports.out.UserModelPort;

public class UniqueEmailPolicy implements UserPolicy {

    private final UserModelPort userModelPort;

    public UniqueEmailPolicy(UserModelPort userModelPort) {
        this.userModelPort = userModelPort;
    }

    @Override
    public void checkCanRegister(User user) {
        if (userModelPort.existsByEmail(user.getEmail())) {
            throw new BusinessRuleViolationException("Email ya está registrado");
        }
    }


}
