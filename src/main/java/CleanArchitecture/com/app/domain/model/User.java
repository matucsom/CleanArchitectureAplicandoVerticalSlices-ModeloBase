package CleanArchitecture.com.app.domain.model;


import lombok.Builder;

import java.util.Collections;
import java.util.List;

public class User {
    private  Long id;
    private  String email;
    private  String password;
    private  List<Note> listOfNotes;




    private User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
        this.listOfNotes = builder.listOfNotes != null ?
                Collections.unmodifiableList(builder.listOfNotes)
                : Collections.emptyList();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Note> getListOfNotes() {
        return listOfNotes;
    }

    private void setEmail (){
        if(email==null || email.isBlank()) throw new IllegalArgumentException("Nose puede hacer eso de andar poniendo el email en null o vacio,ojito"); //deberia ser custom exception
        this.email=email;
    }

    //Builder
    public static class Builder {
        private Long id;
        private String email;
        private String password;
        private List<Note> listOfNotes;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder listOfNotes(List<Note> listOfNotes) {
            this.listOfNotes = listOfNotes;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
