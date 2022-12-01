package StartedJavaSpringBootProject.demo.Bookstrap;

import StartedJavaSpringBootProject.demo.domain.Author;
import StartedJavaSpringBootProject.demo.domain.Book;
import StartedJavaSpringBootProject.demo.repositories.AuthorRepository;
import StartedJavaSpringBootProject.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public BookStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric =new Author("Eric","Evans");
        Book ddd=new Book("Domain driven Design","12344567");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        Author rod=new Author("Rod","Johnson");
        Book noEjB=new Book("J2EE Development without EJB","3210888327");
        rod.getBooks().add(noEjB);
        noEjB.getAuthors().add(rod);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of books"+bookRepository.count());
    }
}
