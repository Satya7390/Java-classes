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
        this( isbn , title:"unknown" , author:"unknown" );
    }
}
