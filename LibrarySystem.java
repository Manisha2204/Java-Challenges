import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title;
    String author;
    String isbn;


    //constructor
    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //title
    public String getTitle(){
        return title;
    }

    //author
    public String getAuthor(){
        return author;
    }

    //isbn
    public String getIsbn(){
        return isbn;
    }


    @Override
    public String toString(){
        return "Title: "+title+" , Author: "+author+" , ISBN: "+isbn;
    }
}


//use array list
public class LibrarySystem{
    private ArrayList<Book> books = new ArrayList<>();

    //add a book
    //add a book
    public void addBook(Book book) {
        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            System.out.println("Error: Title cannot be empty!");
            return;
        }
        if (book.getAuthor() == null || book.getAuthor().trim().isEmpty()) {
            System.out.println("Error: Author cannot be empty!");
            return;
        }
        if (book.getIsbn() == null || book.getIsbn().trim().isEmpty()) {
            System.out.println("Error: ISBN cannot be empty!");
            return;
        }
        // Check if ISBN already exists
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Error: A book with ISBN " + book.getIsbn() + " already exists!");
                return; // stop execution, do not add
            }
        }

        // If not duplicate, add book
        books.add(book);
        System.out.println("Book added successfully!");
    }


    //remove a book
    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found :(");
    }


    //search a book
    public void searchBook(String title){
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Book found: "+book);
                return;
            }
        }
        System.out.println("Book not found:(");
    }

    //display all the books
    public void displayBook(){
        if(books.isEmpty()){
            System.out.println("Library is Empty:(");
        }
        else{
            System.out.println("Books in the library: ");
            for (Book book:books){
                System.out.println(book);
            }
        }
    }

    //main method
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        Scanner sc = new Scanner(System.in);
        System.out.println("------Library System------");
        while(true){

            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display books");
            System.out.println("5. Exit");

            System.out.print("Choose an Option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){

                case 1: //add book
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter International Standard Book number: ");
                    String isbn = sc.nextLine();

                    library.addBook(new Book(title,author,isbn));
                    break;

                case 2: //remove book
                    System.out.print("Enter ISBN to remove: ");
                    String removeisbn = sc.nextLine();
                    library.removeBook(removeisbn);
                    break;

                case 3: //search book
                    System.out.print("Enter the title to search: ");
                    String searchtitle = sc.nextLine();
                    library.searchBook(searchtitle);
                    break;

                case 4: //display book
                    library.displayBook();
                    break;

                case 5: //exit
                    System.out.println("Thanks for visiting our library!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}