public class Librarian {
	private Library lib;
	
	Librarian() {}
	Librarian(Library lib) { 
		this.lib = lib; 
	}
	
	public void findMeBooksFromAuthor(String author_name) {
		this.lib.printBookFromAuthor(author_name);
	}
	
	public void findMeAvailableBooks() {
		this.lib.printAvailableBooks();
	}
	
	public void findMeBook(String book_title) {
		this.lib.printBookDetails(book_title);
	}

}