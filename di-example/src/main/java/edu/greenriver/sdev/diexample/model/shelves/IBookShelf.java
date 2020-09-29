package edu.greenriver.sdev.diexample.model.shelves;

import edu.greenriver.sdev.diexample.model.books.Book;

public interface IBookShelf
{
    public void add(Book book);
    public boolean remove(Book book);
    public boolean contains(Book book);
}

