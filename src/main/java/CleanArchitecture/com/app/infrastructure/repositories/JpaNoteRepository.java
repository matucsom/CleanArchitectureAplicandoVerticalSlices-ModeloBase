package CleanArchitecture.com.app.infrastructure.repositories;

import CleanArchitecture.com.app.infrastructure.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaNoteRepository extends JpaRepository<NoteEntity, Long> {
}
