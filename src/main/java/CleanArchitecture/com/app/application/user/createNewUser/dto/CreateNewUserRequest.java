package CleanArchitecture.com.app.application.user.createNewUser.dto;




//OJO aca usamos una tecnologia pero solo para evitar CODIGO repetitivo
// se esta acoplando a una tecnologia? si a Lombok, pero si lo sacaramos o dejara de funcionar
//solo afectaria detalles como getters o setters o constructor, no afecta realmente a la logica de dominio o orquestacion
//uncle bob dice que aca ni siquiera iria esto, pero que la mame el no toca codigo. es una paja repetir getter/Setters/builder,etc
// PERO usar lombok NO ES LO MISMO que usar SPRING. aca usar SPRING y una anotacion como "@Service" si estaria completamente ERRADO. por que ahi si costaria trocar a quarkus

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateNewUserRequest {
    private String email;
    private String password;

    public CreateNewUserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() { return email; }
    public String getPassword() { return password; }
}
