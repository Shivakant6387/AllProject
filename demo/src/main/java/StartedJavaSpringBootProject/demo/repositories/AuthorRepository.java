package StartedJavaSpringBootProject.demo.repositories;

import StartedJavaSpringBootProject.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long>
{
}
