package application;

import java.util.Scanner;
import util.LinkedList;

public class BookShelfLinked {
    LinkedList<Book> books;

    public BookShelfLinked() {
        books = new LinkedList<>();
        inputBooks();
        displayBooks();
        removeFirstBook();
        displayBooks();
    }

    public void inputBooks() {
        Scanner scan = new Scanner(System.in);
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println("This book already exists in the list.");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter title for book " + i + ": ");
            String title = scan.nextLine();
            System.out.print("Enter author for book " + i + ": ");
            String author = scan.nextLine();
            System.out.print("Enter ISBN for book " + i + ": ");
            String isbn = scan.nextLine();
            
            // Create and add the book to the list
            Book book = new Book(title, author, isbn);
            books.add(book);
        }
    }

    public void displayBooks() {
        System.out.println("\nDisplaying all books:");
        System.out.println(books.toString());
    }

    public void removeFirstBook() {
        System.out.println("\nRemoving the first book...");
        Book removedBook = books.remove();
        if (removedBook != null) {
            System.out.println(removedBook.getTitle() + " has been removed.");
        } else {
            System.out.println("No books to remove.");
        }
    }
    public void findABook() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the position of the book you want to find: ");
        int position = scan.nextInt();
        Book foundBook = books.get(position);
        
        if (foundBook != null) {
            System.out.println("Found Book: " + foundBook);
        } else {
            System.out.println("No book found at position " + position);
        }
    }


    public static void main(String[] args) {
        new BookShelfLinked();
    }
}
