package pkg;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int choice;
		int bookId;
		String bookName;
		String authorName;
		int bookPrice;
		boolean up_flag = false;
		while(exit== false) {
			System.out.println("==========MENU===========");
			System.out.println("Please choose one of the following: ");
			System.out.println("1 - Create a book");
			System.out.println("2 - Read a book");
			System.out.println("3 - Read all the books");
			System.out.println("4 - Update a book");
			System.out.println("5 - Delete a book");
			System.out.println("6 - Exit");
			choice = sc.nextInt();
			BookDAOImpl bd = new BookDAOImpl();
			switch(choice) {
				case 1:
					System.out.println("Please enter the bookId");
					bookId = sc.nextInt();
					sc.nextLine();
					System.out.println("Please enter the bookName:");
					bookName = sc.nextLine();
					System.out.println("Please enter the authorName:");
					authorName = sc.nextLine();
					System.out.println("Please enter the bookPrice");
					bookPrice = sc.nextInt();
//					System.out.println(bookId+bookName+authorName+bookPrice);
					bd.addBook(bookId, bookName, authorName, bookPrice);
					break;
				case 2:
					System.out.println("Please enter the bookId");
					bookId = sc.nextInt();
//					sc.nextLine();
					bd.readBook(bookId);
					break;
				case 3:
					bd.readAll();
					break;
				case 4:
					System.out.println("Please enter the bookId of the book to update");
					bookId = sc.nextInt();
					System.out.println("Would you like to update the name or the price or the Author?");
					while (up_flag == false) {
						String up = sc.nextLine();
						if (up.equalsIgnoreCase("Name")) {
							System.out.println("Please enter the new name");
							bookName = sc.nextLine();
							bd.updateName(bookId, bookName);
							up_flag = true;
						} else if (up.equalsIgnoreCase("Price")) {
							System.out.println("Please enter the new price");
							bookPrice = sc.nextInt();
							bd.updatePrice(bookId, bookPrice);
							up_flag = true;
						} else if(up.equalsIgnoreCase("Author")){
							System.out.println("Please enter the new Author");
							authorName = sc.nextLine();
							bd.updateAuthor(bookId, authorName);
							up_flag = true;
						} else{
							up_flag = false;
						}
					}
					break;
				case 5:
					System.out.println("Please enter the bookId");
					bookId = sc.nextInt();
					bd.deleteBook(bookId);
					break;
				case 6:
					exit = true;
					break;
			}
	}

}
	
}
