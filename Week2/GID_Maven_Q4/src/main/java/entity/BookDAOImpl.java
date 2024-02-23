package entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

//import entity.Book;
import util.Hibernate_Util;

public class BookDAOImpl implements BookDAO {

	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		Transaction tr = s.getTransaction();
		tr.begin();
		s.persist(book);
		tr.commit();
		s.close();
	}

	@Override
	public void deleteBook(Long bookId) {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		Transaction tr = s.getTransaction();
		tr.begin();
		String hq = "from Book where bookId= : id";
		Query<Book> bs = s.createQuery(hq, Book.class);
		bs.setParameter("id", bookId);
		if(bs.uniqueResult() != null) {
			Book b = bs.uniqueResult();
			s.remove(b);
			tr.commit();
		} else {
			System.out.println("Error book not found");
		}
		s.close();
	}

	@Override
	public void readBook(Long bookId) {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		Transaction tr = s.getTransaction();
		String hq = "from Book where bookId= :bookId";
		Query<Book> bs = s.createQuery(hq, Book.class);
		bs.setParameter("bookId", bookId);
		if(bs.uniqueResult() != null) {
			System.out.println(bs.uniqueResult());
		} else {
			System.out.println("Error book not found");
		}
		s.close();
	}

	@Override
	public void readAll() {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		String hq = "from Book";
		Query<Book> bs = s.createQuery(hq, Book.class);
		List<Book> b = bs.getResultList();
		Iterator<Book> itr = b.iterator();
		if(itr.hasNext()) {
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		} else {
			System.out.println("No books found");
		}
		s.close();
	}

	@Override
	public void updateAuthor(Long bookId, String authorName) {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		Transaction tr = s.getTransaction();
		tr.begin();
		String hq = "from Book where bookId= : id";
		Query<Book> bs = s.createQuery(hq, Book.class);
		bs.setParameter("id", bookId);
		Book b = bs.uniqueResult();
		if(b != null) {
			b.setAuthorName(authorName);
			s.merge(b);
			tr.commit();
		} else {
			System.out.println("Error book not found");
		}
		s.close();
	}

	@Override
	public void updatePrice(Long bookId, Long price) {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		Transaction tr = s.getTransaction();
		tr.begin();
		String hq = "from Book where bookId= : id";
		Query<Book> bs = s.createQuery(hq, Book.class);
		bs.setParameter("id", bookId);
		Book b = bs.uniqueResult();
		if(b != null) {
			b.setBookPrice(price);
			s.merge(b);
			tr.commit();
		} else {
			System.out.println("Error book not found");
		}
		s.close();
	}

	@Override
	public void updateName(Long bookId, String bookName) {
		// TODO Auto-generated method stub
		Session s = Hibernate_Util.buildSessionFactory().openSession();
		Transaction tr = s.getTransaction();
		tr.begin();
		String hq = "from Book where bookId= : id";
		Query<Book> bs = s.createQuery(hq, Book.class);
		bs.setParameter("id", bookId);
		Book b = bs.uniqueResult();
		if(b != null) {
			b.setBookName(bookName);
			s.merge(b);
			tr.commit();
		} else {
			System.out.println("Error book not found");
		}
		s.close();
	}

}
