package fluffy.springframework.springapp.repositories;

import fluffy.springframework.springapp.model.Book;
import fluffy.springframework.springapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
