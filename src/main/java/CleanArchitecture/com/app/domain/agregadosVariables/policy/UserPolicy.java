package CleanArchitecture.com.app.domain.agregadosVariables.policy;

import CleanArchitecture.com.app.domain.model.User;

public interface UserPolicy {
    void checkCanRegister(User user);
}