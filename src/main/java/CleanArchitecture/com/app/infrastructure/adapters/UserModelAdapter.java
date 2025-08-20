package CleanArchitecture.com.app.infrastructure.adapters;

import CleanArchitecture.com.app.domain.model.User;
import CleanArchitecture.com.app.domain.ports.out.UserModelPort;
import CleanArchitecture.com.app.infrastructure.entities.UserEntity;
import CleanArchitecture.com.app.infrastructure.exceptions.SaveErrorException;
import CleanArchitecture.com.app.infrastructure.mappers.UserEntityMapper;
import CleanArchitecture.com.app.infrastructure.repositories.JpaUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserModelAdapter implements UserModelPort{


    private final JpaUserRepository jpaUserRepository;

    public UserModelAdapter(JpaUserRepository jpaUserRepository) {

        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User save(User user) {
        try {

            UserEntity entity = UserEntityMapper.toEntity(user);
            UserEntity saved = jpaUserRepository.save(entity);
            return UserEntityMapper.toDomain(saved);

        } catch (Exception e){
            log.error(e.getMessage());
           // throw new SaveErrorException();
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public boolean existsByEmail(String email) {

        return jpaUserRepository.existsByEmail(email);
    }
}
