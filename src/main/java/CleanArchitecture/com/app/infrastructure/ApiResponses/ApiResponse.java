package CleanArchitecture.com.app.infrastructure.ApiResponses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse {

    private int status;
    private String message;
    private LocalDateTime timestamp;

    public ApiResponse(int status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
