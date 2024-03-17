package com.example.entity;

//import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int book_id;
	@Column
	private String book_title;
	@Column
	private int book_price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_price=" + book_price + "]";
	}
	public Book(String book_title, int book_price) {
		this.book_title = book_title;
		this.book_price = book_price;
	}
	public Book(int book_id, String book_title, int book_price) {
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_price = book_price;
	}

}
