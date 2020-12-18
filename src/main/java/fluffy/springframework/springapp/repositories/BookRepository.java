package fluffy.springframework.springapp.repositories;

import fluffy.springframework.springapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
