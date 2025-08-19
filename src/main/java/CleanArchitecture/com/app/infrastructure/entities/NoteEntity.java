package CleanArchitecture.com.app.infrastructure.entities;

import CleanArchitecture.com.app.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "note")
public class NoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String title;

    private  String body;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private  UserEntity owner;

    private Boolean enabled;
}
