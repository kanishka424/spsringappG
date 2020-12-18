package fluffy.springframework.springapp.repositories;

import fluffy.springframework.springapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
