package CleanArchitecture.com.app.infrastructure.mappers;

import CleanArchitecture.com.app.domain.model.User;
import CleanArchitecture.com.app.infrastructure.entities.UserEntity;

public class UserEntityMapper {

    public static UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        return entity;
    }

    public static User toDomain(UserEntity entity) {
        return new User.Builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build();
    }
}
