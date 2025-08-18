package CleanArchitecture.com.app.application.user.createNewUser.usecase.port.in;

import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserRequest;
import CleanArchitecture.com.app.application.user.createNewUser.dto.CreateNewUserResponse;
import CleanArchitecture.com.app.domain.model.User;

// A VER  aca el useCase deberia SOLO hablar de dominio y no de req y response, eso se deberia
// encargar una capa intermedia como la que hizo facu PERO esta capa deberia vivir en infra
// y se deberia ADAPTAR tanto en la entrada como en la salida en INFRA
// pero aca en useCase manejamos todoo lo que es  DOMAIN
public interface CreateNewUser {
    public CreateNewUserResponse createNewUser(CreateNewUserRequest createNewUserRequest);
}
