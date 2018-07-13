package sets;
import java.util.ArrayList;

public class LibraryTest {
	public static void main(String[] args) {
		Library library = new Library();
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Moby-Dick","Herman Melville",585));
		books.add(new Book("War and peace","Leo Tolstoy",1225));
		books.add(new Book("The Three Musketeers","Alexandre Dumas",700));
		books.add(new Book("War and peace","Leo Tolstoy",1225));
		books.add(new Book("Animal Farm","George Orwell",120));
		ArrayList<Book> booksInBg = new ArrayList<>();
		booksInBg.add(new Book("Моби дик","Херман Мелвил",585));
		booksInBg.add(new Book("Война и мир","Лео Толстой",1225));
		booksInBg.add(new Book("Тримата мускетари","Александер Дюма",700));
		booksInBg.add(new Book("Война и мир","Лео Толстой",1225));
		booksInBg.add(new Book("Фермата на животните","Джордж Оруел",120));
		library.addBooks(booksInBg);
		System.out.println(library);
		try {
			Book book = library.getBook("Моби дик");
			System.out.println("Взимаме книга: " + book);
			System.out.println("Махаме книга:" + library.removeBook(book));
			System.out.println("Взимаме книга:" + library.getBook("Моби дик"));
		} catch(Exception exc) {
			System.out.println("Няма такава книга!");
		}
	}
}
