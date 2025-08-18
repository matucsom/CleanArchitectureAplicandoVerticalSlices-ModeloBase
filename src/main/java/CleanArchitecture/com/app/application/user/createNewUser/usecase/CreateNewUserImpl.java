package CleanArchitecture.com.app.application.user.createNewUser.usecase;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserResponse;
import CleanArchitecture.com.app.application.user.createNewUser.mapper.CreateNewUserMapper;
import CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in.CreateNewUser;
import CleanArchitecture.com.app.application.user.createNewUser.validator.UserValidator;
import CleanArchitecture.com.app.domain.model.User;
import CleanArchitecture.com.app.domain.agregadosVariables.policy.UserPolicy;
import CleanArchitecture.com.app.domain.ports.out.UserModelPort;



public class CreateNewUserImpl implements CreateNewUser {

    private final UserModelPort userModelPort;
    private final UserValidator validator;
    private final UserPolicy userPolicy;

    public CreateNewUserImpl(UserModelPort userModelPort, UserValidator validator, UserPolicy userPolicy) {
        this.userModelPort = userModelPort;
        this.validator = validator;
        this.userPolicy = userPolicy;
    }

    public CreateNewUserResponse createNewUser(CreateNewUserRequest request) {

        validator.validate(request);
        User user = CreateNewUserMapper.toDomain(request); //Ojito, mira abajo los comments
        userPolicy.checkCanRegister(user);
        User savedUser = userModelPort.save(user);
        return CreateNewUserMapper.toResponse(savedUser);

    }

}


// asi el useCase queda limpio como caja de facturas a las 9.30
// sin depender de ninguna tecnologia  o framework

// aca deberiamos hacer una capa como la que hizo facu, capa especifica para adaptar la entrada y salida de datos
// asi el useCase solo hablo de DOMAIN o Application
// PERO la capa deberia ir en INFRASTRUCTURE, o podemos dejarlo en el controller que es el adaptador del mundo exterior
// ambas son 2 soluciones pero una es mas enterprise y la otra mas simplista(el cual conviene para nuestro caso que solo manejamos REST)
