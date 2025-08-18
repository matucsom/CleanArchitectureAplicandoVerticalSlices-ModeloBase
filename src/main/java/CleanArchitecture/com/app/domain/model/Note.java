package CleanArchitecture.com.app.domain.model;

import java.util.Collections;
import java.util.List;

public class Note {

    private final Long id;
    private final String title;
    private final String body;
    private final User owner;

    private Note(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.body = builder.body;
        this.owner = builder.owner;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public User getOwner() {
        return owner;
    }

    // --- Builder ---
    public static class Builder {
        private Long id;
        private String title;
        private String body;
        private User owner;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder owner(User owner) {
            this.owner = owner;
            return this;
        }

        public Note build() {
            return new Note(this);
        }
    }

}
