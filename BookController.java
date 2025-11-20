package org.jsp.lms;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book b) {
		
		return service.saveBook(b);
	}
	
	
	@GetMapping("/books")
	public List<Book> findAllBooks(){
		
		return service.findAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book findById(@PathVariable int id) {
		 return service.findById(id);
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	

}
