package guru.springframework.spring5webapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	@EntityGraph(attributePaths = {"authors"})
    List<Book> findAll();
}
