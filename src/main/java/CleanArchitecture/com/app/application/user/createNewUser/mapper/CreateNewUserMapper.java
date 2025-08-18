package CleanArchitecture.com.app.application.user.createNewUser.mapper;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserResponse;
import CleanArchitecture.com.app.domain.model.User;

public class CreateNewUserMapper {

    public static User toDomain(CreateNewUserRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Request no puede ser null");
        }

        return new User.Builder()
                .id(null)
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

    // Domain → DTO
    public static CreateNewUserResponse toResponse(User user) {
        return new CreateNewUserResponse.Builder()
                .id(user.getId())
                .email(user.getEmail())
                .build();
    }
}
