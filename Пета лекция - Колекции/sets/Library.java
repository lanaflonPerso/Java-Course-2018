package sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Library {
	TreeSet<Book> books;
	
	public Library() {
		books = new TreeSet<>();
	}
	
	public Library(TreeSet<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	public void addBooks(ArrayList<Book> booksToAdd) {
		for(Book book: booksToAdd) {
			books.add(book);
		}
	}
	public Book getBook(String title) throws Exception {
		for(Book temp : books) {
			if(temp.getTitle()==title) {
				return temp;
			}
		}
		throw new Exception("No such book!");
	}
	
	public boolean removeBook(Book bookToRemove) throws Exception {
		if(!books.contains(bookToRemove)) throw new Exception("No such book!");
		return books.remove(bookToRemove);
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		for(Book book : books) {
			string.append(book + "\n");
		}
		return string.toString();
	}
}
