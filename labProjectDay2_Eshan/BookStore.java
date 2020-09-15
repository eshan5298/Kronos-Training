package labProjectDay2_Eshan;

import java.util.Scanner;

class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	private int numOfCopies;

	public Book(String title, String author2, String isbn2, int noofcopies) {
		this.bookTitle = title;
		this.author = author2;
		this.isbn = isbn2;
		this.numOfCopies = noofcopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int no) {
		this.numOfCopies = no;
	}

	public void displayBook() {
		System.out.println("Book title:" + bookTitle);
		System.out.println("Book author:" + author);
		System.out.println("Book isbn:" + isbn);
		System.out.println("No. of copies" + numOfCopies);
	}

}

class Booksto {
	private static Book[] books = new Book[10];
	private static int count = -1;

	public static void display() {
		for (int i = 0; i <= count; i++) {
			Book book = books[i];
			book.displayBook();
			System.out.println();
		}
	}

	public static void order(String isbn, int noofcopies) {
		boolean bookPresent = false;
		for (int i = 0; i <= count; i++) {
			Book book = books[i];
			if (book.getIsbn().equals(isbn)) {
				bookPresent = true;
				book.setNumOfCopies(book.getNumOfCopies() + noofcopies);
			}
		}
		if (!bookPresent) {
			System.out.println("Book not present in the list: Enter book title & Enter author name");
			Scanner scan = new Scanner(System.in);
			String author = scan.next();
			String title = scan.next();
			Book newBook = new Book(title, author, isbn, noofcopies);
			books[++count] = newBook;
			System.out.println("Book added!");
			scan.close();
		}
	}

	public static void sell(String title, int noofcopies) {
		boolean bookPresent = false;
		for (int i = 0; i <= count; i++) {
			Book book = books[i];
			if (book.getBookTitle().equals(title)) {
				bookPresent = true;
				if (book.getNumOfCopies() < noofcopies) {
					System.out.println("Not enough stock: " + book.getNumOfCopies());
				} else {
					book.setNumOfCopies(book.getNumOfCopies() - noofcopies);
					System.out.println(noofcopies + " sold!");
				}
			}
		}
		if (!bookPresent) {
			System.out.println("No book with title - " + title);
		}
	}

}

public class BookStore {
	public static void main(String[] args) {
		System.out.println("Enter 1 for book details");
		System.out.println("Enter 2 for order new books");
		System.out.println("Enter 3 for sell books");
		System.out.println("Enter 0 to exit");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		while (choice == 1 || choice == 2 || choice == 3) {
			if (choice == 1) {
				Booksto.display();
			} else if (choice == 2) {
				System.out.println("Enter the isbn code of the book");
				String isbn = scan.next();
				System.out.println("Enter the no of copies you want to order");
				int noofcopies = scan.nextInt();
				Booksto.order(isbn, noofcopies);
			} else {
				System.out.println("Enter the title & no of copies to sell");
				String title = scan.next();
				int noofcopies = scan.nextInt();
				Booksto.sell(title, noofcopies);
			}
		}
		scan.close();
	}

}
