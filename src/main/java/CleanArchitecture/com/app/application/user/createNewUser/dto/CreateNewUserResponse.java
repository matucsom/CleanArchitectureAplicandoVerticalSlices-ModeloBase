package CleanArchitecture.com.app.application.user.createNewUser.dto;



// esto es un estilo mas purista

public class CreateNewUserResponse {
    private final Long id;
    private final String email;

    private CreateNewUserResponse(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
    }

    public Long getId() { return id; }
    public String getEmail() { return email; }

    public static class Builder {
        private Long id;
        private String email;

        public Builder id(Long id) { this.id = id; return this; }
        public Builder email(String email) { this.email = email; return this; }

        public CreateNewUserResponse build() { return new CreateNewUserResponse(this); }
    }
}
