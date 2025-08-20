package CleanArchitecture.com.app.infrastructure.exceptions;

public class SaveErrorException extends RuntimeException {

    public SaveErrorException () {
        super("Error al intentar guardar en base de datos");
    }
}
