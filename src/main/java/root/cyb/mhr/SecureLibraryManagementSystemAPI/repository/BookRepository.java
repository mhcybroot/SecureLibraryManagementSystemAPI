package root.cyb.mhr.SecureLibraryManagementSystemAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.cyb.mhr.SecureLibraryManagementSystemAPI.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
