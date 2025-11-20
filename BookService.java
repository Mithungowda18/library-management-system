package org.jsp.lms;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookDao dao;

	public Book saveBook(Book b) {
	
		Book savedBook = dao.saveBook(b);
		return savedBook;
	}

	public List<Book> findAllBooks() {
		List<Book> allBooks = dao.findAllBooks();
		return allBooks;
	}

	public Book findById(int id) {
	Optional<Book>	optional= dao.findById(id);
	if (optional.isPresent()) {
		return optional.get();
	}else {
		return null;
	}
	}

	public String deleteById(int id) {
		return dao.deleteById(id);
		
	}
}
	

