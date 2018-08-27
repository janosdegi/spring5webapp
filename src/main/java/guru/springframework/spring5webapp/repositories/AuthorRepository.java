package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dégi János on 2018.08.27..
 */
public interface AuthorRepository extends CrudRepository <Author, Long> {
}
