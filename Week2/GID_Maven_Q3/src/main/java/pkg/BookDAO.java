package pkg;

public interface BookDAO {

	public void addBook(int bookId, String bookName, String authorName, int bookPrice);
	public void deleteBook(int bookId);
	public void readBook(int bookId);
	public void readAll();
	public void updateAuthor(int bookId, String authorName);
	public void updatePrice(int bookId, int price);
	public void updateName(int bookId, String bookName);
}
