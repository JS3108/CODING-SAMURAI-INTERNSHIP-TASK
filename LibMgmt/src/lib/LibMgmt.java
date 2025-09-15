package lib;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;//set to false as all books are present initially
    }

    public void borrowBook() {//borrow
        if (!isBorrowed) { //allow borrowing only if not borrowed earlier
            isBorrowed = true;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {//deny if user tries to get a borrowed book
            System.out.println("Sorry, \"" + title + "\" is already borrowed.");
        }
    }

    public void returnBook() {//return
    	if (isBorrowed) {
            isBorrowed = false; //change status of borrowed to "false" once user returns book
            System.out.println("You have successfully returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");//deny if user tries to return an un-borrowed book
        }
    }

    public void checkStatus() {//method to check the current status of book, used in case 1 to display status
        System.out.println(title + " - " + (isBorrowed ? "Borrowed" : "Available"));
    }
}

public class LibMgmt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Sample books are hard-coded as functionality states search for books, check availability, and track borrowing history.
        
        //Fiction, Classics, Literature
        books.add(new Book("Harry Potter and the Philosopher's Stone"));
        books.add(new Book("The Lord of the Rings"));
        books.add(new Book("To Kill a Mockingbird"));
        books.add(new Book("1984"));
        books.add(new Book("The Great Gatsby"));

        //Mythology, Historical Fiction, Spiritual
        books.add(new Book("Ramayana"));
        books.add(new Book("Mahabharata"));
        books.add(new Book("Bhagavad Gita"));
        books.add(new Book("The Palace of Illusions"));
        books.add(new Book("Shiva Trilogy - The Immortals of Meluha"));

        //Academic, Study, Computer Science
        books.add(new Book("Introduction to Algorithms"));
        books.add(new Book("Clean Code"));
        books.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        books.add(new Book("Artificial Intelligence: A Modern Approach"));
        books.add(new Book("Operating System Concepts"));

        //History, Philosophy, Biography, Self-Help, Personal Growth
        books.add(new Book("Sapiens: A Brief History of Humankind"));
        books.add(new Book("Ikigai: The Japanese Secret to a Long and Happy Life"));
        books.add(new Book("Wings of Fire"));
        books.add(new Book("Rich Dad Poor Dad"));
        books.add(new Book("Atomic Habits"));


        int choice;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {//to display
                case 1://list all available books with their status
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        books.get(i).checkStatus();
                    }
                    break;

                case 2://to borrow
                    System.out.print("Enter the book number to borrow: ");
                    int borrowIndex = sc.nextInt() - 1;//-1 as array's index starts from 0
                    if (borrowIndex >= 0 && borrowIndex < books.size()) {//let user borrow only if valid index is provided
                        books.get(borrowIndex).borrowBook();
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 3://to return, same logic as borrow
                    System.out.print("Enter the book number to return: ");
                    int returnIndex = sc.nextInt() - 1;
                    if (returnIndex >= 0 && returnIndex < books.size()) {
                        books.get(returnIndex).returnBook();
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 4://exit
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
