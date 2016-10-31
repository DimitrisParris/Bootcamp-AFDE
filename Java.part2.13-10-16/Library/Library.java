public class Library {
	Book [] books = new Book[20];
	
	
	// Constructor
	public Library() { 	}
	
	public Library(Book[] books) {
        this.books = books;
        }
	
	public void printAvailableBooks() {
		int sum=0;
		for (int i = 0; i<15; i++){
			if (books[i].isAvailable()){
				sum++;
				System.out.println(sum + "." + books[i].toString());}
		}
	}
	
	public void printBookDetails(String book_title) {
		for (int i = 0; i<books.length; i++){
			if(books[i].getTitle().equals(book_title)){
				System.out.println(books[i].toString());
				}
			else{System.out.println("This book does not exist!");}
		}
	}
	
	public void printBookFromAuthor(String author_name) {
		for (int i = 0; i<books.length; i++){
			if(books[i].getAuthor().getName().equals(author_name)){
				System.out.println(books[i].toString());
				}
		}
	}
	

}