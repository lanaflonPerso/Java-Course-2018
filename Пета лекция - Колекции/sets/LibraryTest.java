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
		booksInBg.add(new Book("���� ���","������ ������",585));
		booksInBg.add(new Book("����� � ���","��� �������",1225));
		booksInBg.add(new Book("������� ���������","���������� ����",700));
		booksInBg.add(new Book("����� � ���","��� �������",1225));
		booksInBg.add(new Book("������� �� ���������","������ �����",120));
		library.addBooks(booksInBg);
		System.out.println(library);
		try {
			Book book = library.getBook("���� ���");
			System.out.println("������� �����: " + book);
			System.out.println("������ �����:" + library.removeBook(book));
			System.out.println("������� �����:" + library.getBook("���� ���"));
		} catch(Exception exc) {
			System.out.println("���� ������ �����!");
		}
	}
}
