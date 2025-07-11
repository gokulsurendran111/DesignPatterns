package org.lld;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookCollection implements Iterable<Book> {

    private Set<Book> books;

    public BookCollection() {
        books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
