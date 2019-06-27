package qa.nationwide1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import qa.nationwide1.model.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {

}
