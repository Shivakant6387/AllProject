package StartedJavaSpringBootProject.demo.repositories;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookRepository,Long> {
}
