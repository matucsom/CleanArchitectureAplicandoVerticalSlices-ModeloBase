package CleanArchitecture.com.app.infrastructure.exceptions;

public class SaveErrorException extends RuntimeException {

    public SaveErrorException () {
        super("Error guardando, se confundio de barrio. aca usted no mueve la rama");
    }
}
