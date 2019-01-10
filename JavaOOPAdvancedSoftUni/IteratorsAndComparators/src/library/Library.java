package library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {

    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return null;
    }

    private final class LibraryIterator implements Iterator<Book>{
        private int counter;

        @Override
        public boolean hasNext() {
            return books.length > counter;
        }

        @Override
        public Book next() {
            return books[this.counter++];
        }
    }


}
