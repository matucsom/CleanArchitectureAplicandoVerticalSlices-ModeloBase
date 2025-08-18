package CleanArchitecture.com.app.infrastructure.controllers.rest;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserResponse;
import CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in.CreateNewUser;
import CleanArchitecture.com.app.infrastructure.factory.UserUseCaseFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserUseCaseFactory useCaseFactory;


    public UserController( UserUseCaseFactory userUseCaseFactory) {
        this.useCaseFactory = userUseCaseFactory;
    }

    @PostMapping
    public ResponseEntity<CreateNewUserResponse> createUser(@RequestBody CreateNewUserRequest req) {
        CreateNewUser createNewUser = useCaseFactory.createNewUser();
        CreateNewUserResponse response=createNewUser.createNewUser(req);
        return ResponseEntity.ok(response);
    }
}














































// Si tu response tiene id, es ideal devolver 201 Created con Location:
// URI location = URI.create("/api/users/" + response.getId());
// return ResponseEntity.created(location).body(response);
