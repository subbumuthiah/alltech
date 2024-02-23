package entity;

public interface BookDAO {

	public void addBook(Book book);
	public void deleteBook(Long bookId);
	public void readBook(Long bookId);
	public void readAll();
	public void updateAuthor(Long bookId, String authorName);
	public void updatePrice(Long bookId, Long price);
	public void updateName(Long bookId, String bookName);
}
