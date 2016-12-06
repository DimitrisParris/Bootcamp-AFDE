package review7;

public class Book {
 private String title;
 private String author;
 private int year_of_release;
 
public Book(String title, String author, int year_of_release) {
	super();
	this.title = title;
	this.author = author;
	this.year_of_release = year_of_release;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getYear_of_release() {
	return year_of_release;
}

public void setYear_of_release(int year_of_release) {
	this.year_of_release = year_of_release;
}

@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", year_of_release=" + year_of_release + "]";
}
 

 
 
 
 
}
