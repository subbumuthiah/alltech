package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.service.annotation.PutExchange;

import com.example.entity.Book;
import com.example.exc.BookException;
import com.example.repository.BookRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")
public class BookController {

	@Autowired
	private BookRepository br;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return br.findAll();
	}
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book b) {
		return br.save(b);
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookId(@PathVariable int id) throws BookException{
		Book b = br.findById(id).orElseThrow(() -> new BookException("Not found"));
		return ResponseEntity.ok(b);
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book b) throws BookException{
		Book bo = br.findById(id).orElseThrow(() -> new BookException("Not found"));
		bo.setBook_price(b.getBook_price());
		bo.setBook_title(b.getBook_title());
		Book b_up = br.save(bo);
		return ResponseEntity.ok(b_up);
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteBook(@PathVariable int id) throws BookException{
		Book b = br.findById(id).orElseThrow(() -> new BookException("Not found"));
		br.delete(b);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", true);
		return ResponseEntity.ok(response);
	}
}
