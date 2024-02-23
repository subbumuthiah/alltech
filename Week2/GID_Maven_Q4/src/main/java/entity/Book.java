package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long bookId;
	@Column
	private String bookName;
	@Column
	private String authorName;
	@Column
	private Long bookPrice;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Long getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "The bookId is: " + bookId + ", bookName is: " + bookName + ", authorName is: " + authorName + ", bookPrice is: "
				+ bookPrice;
	}
	public Book(String bookName, String authorName, Long bookPrice) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}
	
	

}
