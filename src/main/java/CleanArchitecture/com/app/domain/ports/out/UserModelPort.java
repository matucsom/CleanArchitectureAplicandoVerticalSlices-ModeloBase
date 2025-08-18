package CleanArchitecture.com.app.domain.ports.out;

import CleanArchitecture.com.app.domain.model.User;

public interface UserModelPort {
    User save(User user);

    boolean existsByEmail(String email);
}
