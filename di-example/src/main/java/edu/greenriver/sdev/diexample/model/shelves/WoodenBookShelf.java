package edu.greenriver.sdev.diexample.model.shelves;

import edu.greenriver.sdev.diexample.model.books.Book;

public class WoodenBookShelf implements IBookShelf
{
    public WoodenBookShelf()
    {
        System.out.println();
    }

    public void add(Book book)
    {
        System.out.println("Book added to wooden shelf");
    }

    public boolean remove(Book book)
    {
        return false;
    }

    public boolean contains(Book book)
    {
        return false;
    }
}
