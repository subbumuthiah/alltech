package pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAOImpl implements BookDAO {

	private static final String ADD = "Insert into book_jdbc(bookId, bookName, authorName, bookPrice) values(?, ? ,? ,?);";
	private static final String DELETE= "Delete from book_jdbc where bookId = ?;";
	private static final String READ= "Select bookId, bookName, authorName, bookPrice from book_jdbc where bookId = ?;";
	private static final String READ_ALL= "Select bookId, bookName, authorName, bookPrice from book_jdbc;";
	private static final String UPDATE_AUTHOR= "Update book_jdbc set authorName = ? where bookId = ?;";
	private static final String UPDATE_PRICE= "Update book_jdbc set bookPrice = ? where bookId = ?;";
	private static final String UPDATE_NAME= "Update book_jdbc set bookName = ? where bookId = ?;";
	
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBook(int bookId, String bookName, String authorName, int bookPrice) {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(ADD);
			query.setInt(1, bookId);
			query.setString(2, bookName);
			query.setString(3, authorName);
			query.setInt(4, bookPrice);
			int i = query.executeUpdate();
			if(i == 0) {
				System.out.println("err");
			}else {
				System.out.println("The record has been created: bookId: "+bookId+", bookName: "+bookName+", authorName: "+authorName+", bookPrice: "+bookPrice);
			}
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(DELETE);
			query.setInt(1, bookId);
			int i = query.executeUpdate();
			if(i == 0) {
				System.out.println("err");
			}else {
				System.out.println("The record has been deleted");
			}
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

	@Override
	public void readBook(int bookId) {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(READ);
			query.setInt(1, bookId);
			ResultSet rs1 = query.executeQuery();
			if(rs1.next()) {
				do{
//					System.out.println("reached");
					int bid = rs1.getInt("bookId");
					String bname = rs1.getString("bookName");
					String aname = rs1.getString("authorName");
					int bp = rs1.getInt("bookPrice");
					System.out.println("The book id is: "+bid+", the name is: "+bname+", the author is: "+aname+", the price is: "+bp);
				}while(rs1.next());
			} else {
				System.out.println("Error no book found");
			}
			
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

	@Override
	public void readAll() {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(READ_ALL);
//			query.setInt(1, bookId);
			ResultSet rs1 = query.executeQuery();
			if(rs1.next()) {
				do{
					int bid = rs1.getInt("bookId");
					String bname = rs1.getString("bookName");
					String aname = rs1.getString("authorName");
					int bp = rs1.getInt("bookPrice");
					System.out.println("The book id is: "+bid+", the name is: "+bname+", the author is: "+aname+", the price is: "+bp);
				}while(rs1.next()) ;
			} else {
				System.out.println("No books found");
			}
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

	@Override
	public void updateAuthor(int bookId, String authorName) {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(UPDATE_AUTHOR);
			query.setString(1, authorName);
			query.setInt(2, bookId);
			int i = query.executeUpdate();
			if(i == 0) {
				System.out.println("err");
			}else {
				System.out.println("The record has been updated");
			}
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

	@Override
	public void updatePrice(int bookId, int price) {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(UPDATE_PRICE);
			query.setInt(1, price);
			query.setInt(2, bookId);
			int i = query.executeUpdate();
			if(i == 0) {
				System.out.println("err");
			}else {
				System.out.println("The record has been updated");
			}
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

	@Override
	public void updateName(int bookId, String bookName) {
		// TODO Auto-generated method stub
		try(Connection c = MyConnection.getConnection()){
			PreparedStatement query = c.prepareStatement(UPDATE_NAME);
			query.setString(1, bookName);
			query.setInt(2, bookId);
			int i = query.executeUpdate();
			if(i == 0) {
				System.out.println("err");
			}else {
				System.out.println("The record has been updated");
			}
		} catch(SQLException q){
			q.printStackTrace();
		}
	}

}
