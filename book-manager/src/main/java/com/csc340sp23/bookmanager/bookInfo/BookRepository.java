
package com.csc340sp23.bookmanager.bookInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
