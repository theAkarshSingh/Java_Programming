package Aggregation;

public class Main {
    static void main() {
        // Aggregation => represents a relationship between objects one object contains another as part of structure,
        // but the contained object(s) can exist independently.
        Book book1 = new Book("The courage to be disliked", 264);
        Book book2 = new Book("Psychology of Money", 250);
        Book book3 = new Book("Deep work", 200);

        Book[] books = {book1, book2, book3};
        Library lib = new Library("Central Library", 2000, books);
        lib.displayInfo();
    }
}
