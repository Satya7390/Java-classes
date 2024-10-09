// 51. Create a Book class for a library system.
// · Instance variables: title, author, isbn.
// . Static variable: totalBooks, a counter for the total number of book
// instances.
// · Instance methods: borrowBook(), returnBook().
// . Static method: getTotalBooks(), to get the total number of books in the
// library.

/**
 * 51 Book
 */
class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
         totalNoOfBooks = 0;
    }

    { // object init
        totalNoOfBooks ++;
   }

    Book(String isbn ,String title, String author ) {
        
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book (String isbn){ 
        this( isbn ,"unknown" , "unknown" );
    }

    static int getTotalBooks(){
        return totalNoOfBooks ;
    }
    void borrowBook(){
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the " +this.title +" Book!!");
        }
    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book!! , please leave a review");
        }else{
            System.out.println("This book is already returned in the library!! Thank you for your Privious time...");
        }
    }

    public static void main(String[] args) {
        Book ThingsOfDesign = new Book("1" , "Design" , "Unknown");
        Book myBook = new Book("2");
        System.out.println("Available books in the library is : "+Book.totalNoOfBooks);
        ThingsOfDesign.borrowBook();
        myBook.borrowBook();
        ThingsOfDesign.borrowBook();
        ThingsOfDesign.returnBook();
        ThingsOfDesign.borrowBook();
        ThingsOfDesign.returnBook();
        ThingsOfDesign.returnBook();

    }
}

// Outputs : 
// Available books in the library is : 2
// Enjoy the Design Book!!
// Enjoy the unknown Book!!
// Book is already borrowed
// Hope you enjoyed the book!! , please leave a review
// Enjoy the Design Book!!
// Hope you enjoyed the book!! , please leave a review
// This book is already returned in the library!! Thank you for your Privious time...