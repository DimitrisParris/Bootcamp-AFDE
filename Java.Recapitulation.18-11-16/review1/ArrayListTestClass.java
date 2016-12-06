package review7;

import java.util.ArrayList;

import java.util.Arrays;

public class ArrayListTestClass {
	public static void main(String [] args){
		Book book1 = new Book("title1", "author1", 1991);
		Book book2 = new Book("title1", "author1", 1992);
		Book book3 = new Book("title1", "author1", 1993);
		Book book4 = new Book("title1", "author1", 1994);
		Book book5 = new Book("title1", "author1", 1995);
		
		Book[] book_array = {book1,book2,book3,book4, book5};
		
/**		Book[] book_array2 = new Book[5];
		book_array[0] = book1;
		book_array[1] = book2;
		book_array[2] = book3;
		book_array[3] = book4;
		book_array[4] = book5;
		
		
		
		System.out.println(Arrays.toString(book_array));
		
		ArrayList<Book> book_array_list = new ArrayList<>();
		book_array_list.add(book1);
		book_array_list.add(book2);
		book_array_list.add(book3);
		book_array_list.add(book4);
		book_array_list.add(book5);
		
		System.out.println(book_array_list);
		
		BookList myList = new BookList(book_array);
		myList.add(book1);*/
		
		BookListArrayList book_auto_arraylist = new BookListArrayList();
		book_auto_arraylist.add(book1);
		
		
	}
}
