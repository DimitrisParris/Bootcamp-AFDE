package review7;

import java.util.ArrayList;

public class BookList {
	private ArrayList<Book> books;

	BookList() {// αρχικοποίηση
		this.books = new ArrayList<>();
	}

	BookList(Book[] array) {
		this.books = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			this.books.add(array[i]);
		}
	}

	public void add(Book newBook) {
		this.books.add(newBook);
	}

	public void getBook(int index) {
		this.books.get(index);
	}
}
